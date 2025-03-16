package basics;
public class gcd {
    static int calcGcd(int m, int n){
        if(m == 0 || n == 0) {
            System.out.println("GCD can't be calculated either of the numbers is zero");
            return -1;
        }
        if(n<m){
            int temp = n;
            n=m;
            m = temp;
        }
        int rem = 0;
        do{
            rem = n%m;
            n = m;
            m = rem;
        }
        while(rem != 0);

        return n;
    }

    public static void main(String args[]){
        int gcd = calcGcd(0,2);
        System.out.println(gcd);
    }
}
