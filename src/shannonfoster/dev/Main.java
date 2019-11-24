package shannonfoster.dev;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee e1 = new Employee("Shannon Foster");
        e1.setAge(24);
        e1.setSalary(86000);
        e1.setDesignation("Software Engineer");

        Employee e2 = new Employee("Noel Foster");
        e2.setAge(22);
        e2.setSalary(55000);
        e2.setDesignation("Operations Specialist - Navy");

        System.out.printf("Employee's Information:\n\t\tEmployee's Name: %s\n\t\tEmployee's Role: %s\n\t\tEmployee's Salary: $%.2f\n\t\tEmployee's Age: %d", e1.getName(),e1.getDesignation(),e1.getSalary(), e1.getAge());
        System.out.printf("Employee's Information:\n\t\tEmployee's Name: %s\n\t\tEmployee's Role: %s\n\t\tEmployee's Salary: $%.2f\n\t\tEmployee's Age: %d", e2.getName(),e2.getDesignation(),e2.getSalary(), e2.getAge());
    }
}
