import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Krystian", 9000, 1, "2020-04-20", "Project Manager");
        Worker worker2 = new Worker("Marcin", 5800, 2, "2021-09-11", "Senior Developer");
        Worker worker3 = new Worker("Olaf", 3900, 1, "2022-04-22", "Junior Developer");
        Worker worker4 = new Worker("Olek", 2500, 4, "2023-06-23", "Tester");
        Worker worker5 = new Worker("Adolf", 2200, 3, "2023-03-16", "Tester");
       
        Manager manager1 = new Manager("Anna", 9900, 5, "2019-11-26", "Department Head");
        Manager manager2 = new Manager("Monika", 5500, 1, "2019-04-11", "Department Head");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        Map<Integer, List<Employee>> idMap = new HashMap<>();
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            } if (idMap.containsKey(emp.getId())) {
                idMap.get(emp.getId()).add(emp);
            } else {
                List<Employee> empList = new ArrayList<>();
                empList.add(emp);
                idMap.put(emp.getId(), empList);
            }
        }

         System.out.println("Total salary: " + totalSalary);
        System.out.println("Total manager salary: " + totalManagerSalary);
        System.out.println("Total worker salary: " + totalWorkerSalary);

        for (Map.Entry<Integer, List<Employee>> entry : idMap.entrySet()) {
            List<Employee> empList = entry.getValue();
            if (empList.size() > 1) {
                System.out.println("Employees with same ID: ");
                for (Employee emp : empList) {
                    System.out.println("- " + emp.getName());
                }
            }
        }
    }
}