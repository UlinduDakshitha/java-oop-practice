//Encapsulation

public class Student {
    private String name;
    private int age;
    private boolean Smoke;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSmoke(boolean Smoke) {
        this.Smoke = Smoke;
    }

    public boolean getSmoke() {
        return Smoke;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
