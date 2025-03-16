package OOPS;
class parent {
   static{
      System.out.println("I am parent class static block");
   }
    int len;
    int breadth;
 
    parent(int var1, int var2) {
      System.out.println("I am super class constructor");
       this.len = var1;
       this.breadth = var2;
    }
 
    protected void display() {
       System.out.println("Super class " + this.len + " " + this.breadth);
    }

    final void meth1(){
      System.out.println("Final");
    }
    final void meth1(int x){
      System.out.println("Final: "+x);
    }
    
}

class child extends parent {
    int height;
    static{
      System.out.println("I am a child class static block");
    }
 
    child(int var1,int var2,int var3) {
      super(var1, var2);
      System.out.println("I am a child class constructor");
       this.height = var3;
    }
 
    public void display() {
       System.out.println("Child class " + this.height);
    }
 
    public static void main(String[] var0) {
      //  parent pr = new parent(2, 3);
       child c = new child(2,3,4);
       c.meth1();
      //  parent pr1 = new child(2,5,4);
      //  pr.display();
      //  ch.display(); //Method override
      //  pr1.display(); //Dynamic method dispatch
    }
 }
