package ua.artcode.week5.day2.generics;

/**
 * 1) declare generic type -> near class
 * 2) use in scope
 * 3) instance , not static
 */
public class Container<V> { // V, E, K

    private V val;

    public Container(V val) {
        this.val = val;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
        this.val = val;
    }

    private void testCreation(){
        // new V(); error
    }


    public static void some(){
       //V t =
    }
}
