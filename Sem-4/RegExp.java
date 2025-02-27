

// import java.util.Scanner;

public class RegExp{
    public static void main(String []args){
        // Scanner sc = new Scanner(System.in);
        // String str = "qwety3@gmail.com";
        // if(str.matches("(\\w{4,11})(@{1})(\\w{3,9})(.com{1})")){
        //     System.out.println("Username: "+str.substring(0,str.indexOf("@")));
        //     System.out.println("Domain name: "+str.substring(str.indexOf("@")));
        // }
        // else{
        //     System.out.println("Enter a valid email address");
        // }

        // String input = sc.nextLine();
        // sc.close();
        //Binary Or Not

        // System.out.println(input.matches("[0-1]*"));
        //HexaDecimal Or Not

        // System.out.println(input.matches("[0-9 A-F]*"));
        //Date format dd-mm-yyyy or not 

        // System.out.println(input.matches("[0-3][0-9]-[0-1][1-9]-[0-9]{4}"));

        //Remove extra spaces in between the words
        // input = input.trim();

        //Remove more than one whitespaces

        // System.out.println(input.replaceAll("\\s+", " "));

        //Count number of words in  a string
        // String words[] = input.split("\\s+");
        // System.out.println(words.length);

        //Fibonacci Series
        int a=0,b=1,n=10;
        System.out.print(a+" "+b);
        while(n!=2){
            int c=a+b;
            System.out.print(" "+c);
            a=b;b=c;
            n--;
        }


    }
}