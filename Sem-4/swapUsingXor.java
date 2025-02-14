public class swapUsingXor{
    public static void main(String args[]){
        int a=5, b=12;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a: "+a+" b: "+b);
    }
}