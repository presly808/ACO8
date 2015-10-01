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

    public void print(){
        System.out.println(asString());
    }

    public MyString concatenate(MyString other){

        char[] thisMas = this.mas;
        char[] otherMas = other.mas;

        char[] sum = new char[thisMas.length + otherMas.length];

        System.arraycopy(thisMas,0,sum,0, thisMas.length);// copy firts arr
        System.arraycopy(otherMas,0,sum, thisMas.length, otherMas.length);// copy firts arr

        return new MyString(sum);

    }
}
