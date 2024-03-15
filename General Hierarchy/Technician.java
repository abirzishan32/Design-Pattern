public class Technician extends Employee {
    private String name;

    public Technician(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Technician Name : " + name);
    }
}
