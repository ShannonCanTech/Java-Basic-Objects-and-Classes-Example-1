package shannonfoster.dev;

public class Employee {

    private String name;
    private String designation;
    private int age;
    private double salary;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public String getDesignation(){
        return designation;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

}
