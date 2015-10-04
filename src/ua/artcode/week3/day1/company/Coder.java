package ua.artcode.week3.day1.company;

/**
 * Created by serhii on 10/3/15.
 */
public class Coder extends Employer {

    private String language;

    public Coder() {
        super();
        language = "Java";
    }

    public Coder(String name, int age, double salary){
        super(name, age, salary);
    }

    private void testAccessToParent(){
        setAge(23);
        getName();

        super.setAge(23);
        super.getName();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void writeCode(){
        System.out.println("coder writes code");
    }

    @Override
    public void work(){
        System.out.println("work coder writes code");
    }

    public String toString(){
        return "coder " + getName();
    }
}
