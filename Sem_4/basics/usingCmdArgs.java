package basics;

public class usingCmdArgs {
    public static void main(String args[]){
        int sum = 0;
        for(String s: args){
            sum += Integer.valueOf(s);
        }
        System.out.println(sum);
    }
}
