package OOPS;

interface Test {
    static void meth3(){
        System.out.println("Static method in interface");
    }
    private void meth4(){
            System.out.println("meth4 called");
    }
    default void meth5(){
        meth4();
    }
        
}
    
    class class1 implements Test {
        public void meth1(){
            Test.meth3();
            System.out.println("Method 1");
        }
        void meth3(){
            System.out.println("Method 3");
        }
    }
    
    public class interfaces {
        public static void main(String[] args) {
            class1 obj = new class1();
            obj.meth1();
            obj.meth3();
        }
    }
