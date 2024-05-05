import java.util.ArrayList;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Krystian", 9000, 1, "2020-04-20", "Project Manager");
        Worker worker2 = new Worker("Marcin", 5800, 2, "2021-09-11", "Senior Developer");
        Worker worker3 = new Worker("Olaf", 3900, 3, "2022-04-22", "Junior Developer");
        Worker worker4 = new Worker("Olek", 2500, 4, "2023-06-23", "Tester");

        Manager manager = new Manager("Anna", 9900, 5, "2019-11-26", "Department Head");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println("- " + emp.getName() + " (ID: " + emp.getId() +
                    ", Position: " + emp.getPosition() +
                    ", Hire date: " + emp.getHireDate() +
                    ", Salary: " + emp.getSalary() + ")");
            emp.work();
        }
    }
}