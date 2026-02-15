import java.util.Scanner;
class twodarradd{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[][] a=new int[3][3];
        int[][] b=new int[3][3];
        int[][] c=new int[3][3];
        System.out.println("Enter first matrix:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter second matrix:");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++){
                b[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum:");
        System.out.println("Matrix:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
            }
}