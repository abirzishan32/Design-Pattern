// This is the read-only interface with a method to get the attribute.
public interface ReadOnlyInterface {
    String getAttribute();
}

// This is the mutable interface that extends the read-only interface and adds a setter method.
public interface Mutable extends ReadOnlyInterface {
    void setAttribute(String attribute);
}

// This is the concrete class that implements the mutable interface.
public class MutableClass implements Mutable {
    private String attribute;

    public MutableClass(String attribute) {
        this.attribute = attribute;
    }

    // Implementation of getAttribute from ReadOnlyInterface
    @Override
    public String getAttribute() {
        return attribute;
    }

    // Implementation of setAttribute from Mutable interface
    @Override
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}

// This is the unprivileged class that can only access the read-only methods.
public class UnprivilegedClass {
    private ReadOnlyInterface readOnlyView;

    public UnprivilegedClass(ReadOnlyInterface readOnlyView) {
        this.readOnlyView = readOnlyView;
    }

    public void printAttribute() {
        System.out.println("Attribute value is: " + readOnlyView.getAttribute());
    }
}

// This is the Mutator class that has the ability to modify the attributes.
public class MutatorClass {
    private Mutable mutableObject;

    public MutatorClass(Mutable mutableObject) {
        this.mutableObject = mutableObject;
    }

    public void changeAttribute(String newValue) {
        mutableObject.setAttribute(newValue);
        System.out.println("Attribute value changed to: " + mutableObject.getAttribute());
    }
}

// Demo class to test our read-only interface pattern.
public class ReadOnlyInterfaceDemo {
    public static void main(String[] args) {
        // Create an instance of MutableClass.
        MutableClass mutableObject = new MutableClass("Initial Value");

        // Create an instance of UnprivilegedClass with a read-only view of mutableObject.
        UnprivilegedClass unprivilegedUser = new UnprivilegedClass(mutableObject);
        unprivilegedUser.printAttribute(); // Outputs: Attribute value is: Initial Value

        // Create an instance of MutatorClass with the ability to modify mutableObject.
        MutatorClass mutatorUser = new MutatorClass(mutableObject);
        mutatorUser.changeAttribute("Changed Value"); // Outputs: Attribute value changed to: Changed Value

        // The unprivilegedUser can only read the attribute, which now reflects the changed value.
        unprivilegedUser.printAttribute(); // Outputs: Attribute value is: Changed Value
    }
}
