package ua.artcode.week3.day1.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by serhii on 10/4/15.
 */
public class Director extends Employer {

    private ArrayList<Employer> arrayList = new ArrayList<Employer>();
    
    public void addEmployer(Employer employer){
        arrayList.add(employer);
    }

    public Employer getEmployer(int cellNumber){
        return arrayList.get(cellNumber); // mas[i]
    }

    public void fireEmployer(Employer employer){
        // Employer overrides equals
        arrayList.remove(employer); // delete first found
    }

    public void makeKipish(){
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).work();
        }
    }

    public void makeKipishForEach(){
        for (Employer employer : arrayList) {
            employer.work();
        }
    }

    public String getAll(){
        Object[] mas =  arrayList.toArray();
        return Arrays.toString(mas);
    }


}
