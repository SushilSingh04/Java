package OOPS;

public class innerClass {
    public static void main(String args[]){
        System.out.println("This is public class");
        Outer o = new Outer();
        o.outerDisplay();
        Outer.Inner i = new Outer().new Inner();
        i.innerDisplay();
    }
}

class Outer{
    int outer =10;
    class Inner{
        int inner=10;
        void innerDisplay(){
            System.out.println("Inside inner class");
        }
    }
    void outerDisplay(){
        System.out.println("Outer class calling inner class method");
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.inner);
    }
}
