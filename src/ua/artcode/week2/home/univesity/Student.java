package ua.artcode.week2.home.univesity;

/**
 * Created by serhii on 01.10.15.
 */
public class Student {


    private String name;
    private String address;
    private Subject[] subjects; // null
    private int index;


    public Student(){
        subjects = new Subject[10];
    }

    public void addSubject(Subject subject){
        subjects[index] = subject;
    }

    public void study(int hours, int subjectIndex){
        Subject targetSubject = subjects[subjectIndex];
        targetSubject.increment(hours);
    }

    public void showSubjectsInfo(){
        for (int i = 0; i < index; i++) {
            subjects[i].printInfo();
        }
    }

}
