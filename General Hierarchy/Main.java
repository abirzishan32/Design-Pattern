import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Employee emp1 = new Technician("Abir");
        Employee emp2 = new Technician("Raufun");
        Employee emp3 = new Technician("Hanium");


        Manager manager1 = new Manager("Shawon");
        manager1.addEmployee(emp1);
        manager1.addEmployee(emp2);

        Manager manager2 = new Manager("Selim");
        manager2.addEmployee(emp3);

        Manager topManager = new Manager("Sheikh Sadi");
        topManager.addEmployee(manager1);
        topManager.addEmployee(manager2);

        topManager.showDetails();

    }
}
