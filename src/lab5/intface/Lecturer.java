package lab5.intface;

public class Lecturer extends Person implements Entity {
    private String department;
    private int salary;

    public Lecturer(String surname, String name, int age, String department, int salary){
        super(surname,name,age);
        this.department=department;
        this.salary=salary;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String printInfo() {
        return "Человек "+surname+" "+name+", возраст: "+age;
    }
}
