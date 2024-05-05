import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Krystian", 9000, 1, "2020-04-20", "Project Manager");
        Worker worker2 = new Worker("Marcin", 5800, 2, "2021-09-11", "Senior Developer");
        Worker worker3 = new Worker("Olaf", 3900, 1, "2022-04-22", "Junior Developer");
        Worker worker4 = new Worker("Olek", 2500, 4, "2023-06-23", "Tester");
        Manager manager = new Manager("Anna", 9900, 5, "2019-11-26", "Department Head");


        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println(worker3.getName() + " equals worker1: " + worker3.equals(worker1));
        System.out.println(worker3.getName() + " equals worker2: " + worker3.equals(worker2));
        System.out.println(worker3.getName() + " equals manager: " + worker3.equals(manager));
    }
}   