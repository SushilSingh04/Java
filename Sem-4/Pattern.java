

// import java.util.Scanner;

public class Pattern{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.close();
        // for(int i=0; i<n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        for(int i=1; i<=5; i++){
            for(int j=1; j<=10; j++){
                if(j+i>6 && j-i<6)
                    System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}