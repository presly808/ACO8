package ua.artcode.week1.home;


public class MyString {

    private char[] mas;

    public MyString(){
    }

    public MyString(char[] mas) {
        this.mas = mas;
    }

    public MyString(String str){
        // String -> char[]
        mas = str.toCharArray();
    }

    public String asString(){
        // char[] -> String
        String str = new String(mas);
        // str = String.valueOf(mas);
        return str;
    }
}
