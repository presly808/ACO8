package ua.artcode.week3.day1.company;

/**
 * Created by serhii on 10/3/15.
 */
public class Employer {

    private int id;
    private String name;
    private int age;
    private double salary;

    public Employer() {
        name = "Default";
        age = 18;
        salary = 1500;
    }

    public Employer(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("employee works");
    }

    @Override
    public boolean equals(Object obj) {
        // reflectivity
        if(this == obj){
            return true;
        }

        // non null
        if(obj == null){
            return false;
        }

        if(!(obj instanceof Employer)){
            return false;
        }

        // this fields eq to obj fields
        Employer other = (Employer) obj;

        return name != null && this.name.equals(other.name)
                && this.age == other.age
                && this.salary == other.salary;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
