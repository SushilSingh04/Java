
public class Arrays2D{
    public static void main(String args[]){
        //Printing using for each loop
        // int b[][] = new int[3][3];
        // for(int a[]:b){
        //     for(int x: a){
        //         System.out.print(x+" ");
        //     }
        //     System.out.println("");
        // }

        //Jagged Array(array with each row having a different length array)
        // int[][] c = new int[3][];
        // c[0] = new int[4];
        // c[1] = new int[5];
        // c[2] = new int[6];

        // for(int a[]: c){
        //     for(int d: a){
        //         System.out.print(d+" ");
        //     }
        //     System.out.println("");
        // }

        //Matrix Multiplication
        int[][] m1 = {{1,2,3},{3,6,4}};
        int[][] m2 = {{2,5,4,2},{1,5,2,5},{5,3,1,4}};
        int[][] m3 = new int[m1.length][m2[0].length];

        for(int i=0; i<m1.length; i++){
            for(int j=0; j<m2[0].length; j++){
                for(int k=0; k<m2.length; k++){
                    m3[i][j] += m1[i][k]*m2[k][j];
                }
            }
        }

        for(int i=0; i<m3.length; i++){
            for(int j=0; j<m3[0].length; j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.println("");
        }

        

    }
}