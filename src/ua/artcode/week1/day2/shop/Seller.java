package ua.artcode.week1.day2.shop;

/**
 * fields (properties)
 */
public class Seller {

    private int id;
    private String fullname; // package-default
    private int age;
    private double salary;

    public void initData(int id, String fullname,
                         int age, double salary) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.salary = salary;
    }

    // get private property via public method
    public int getId(){
        return id;
    }

    // change pri via publ method
    public void setId(int id){
        this.id = id;
    }

    public void showInfo(){
        /*String format = String.format("id : %d, fullname : %s, age : %d, salary : %.2f",
                id,fullname, age,salary);
        */
        System.out.printf("id : %d, fullname : %s, age : %d, salary : %.2f\n",
                id,fullname,age,salary);
    }

    public static void testClass(){
        System.out.println("Seeler class out");
    }

}
