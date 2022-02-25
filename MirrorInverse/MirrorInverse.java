import java.util.*;
class Matrix{
    public static int[][] mirrorImage(int A[][]){
        int temp, half=A[0].length/2;
        for(int row=0; row < A.length; row++){
            for(int col=0; col <=half; col++){
                temp=A[row][A[0].length-1-col];
                A[row][A[0].length-1-col]=A[row][col];
                A[row][col]=temp;
            }
        }
        return A;
    }
    public static void display(int A[][]){
        for(int row=0;row<A.length;row++){
            System.out.print("\t\t\t");
            for(int col=0; col < A.length; col++){
                System.out.print(A[row][col]+"\t");
            }
            System.out.println();
        }
    }
    public static void main( String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT:\t\tM=");
        int M = sc.nextInt();
        if(M<=2 || M>=20){
            System.out.println("OUTPUT:\t\tSIZE OUT OF RANGE");
        }else{
            int A[][] = new int[M][M];
            for(int row=0;row < M;row++){
                for(int col=0; col<M; col++){
                    A[row][col]=sc.nextInt();
                }
            }
            System.out.println("OUTPUT:\t\t");
            System.out.println("ORIGINAL MATRIX");
            display(A);
            A=mirrorImage(A);
            System.out.println("MIRROR IMAGE MATRIX");
            display(A);
        }
    }
}