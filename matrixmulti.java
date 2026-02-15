import java.util.Scanner;
class matrixmulti{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("Enter the rows of A:");
        r1=in.nextInt();
        System.out.println("Enter the columns of A:");
        c1=in.nextInt();
        System.out.println("Enter the rows of B:");
        r2=in.nextInt();
        System.out.println("Enter the columns of B:");
        c2=in.nextInt();
        if(c1!=r2){
            System.out.println("Matrix multiplication not possible");
            return;
        }
        int[][] a=new int[r1][c1];
        int[][] b=new int[r2][c2];
        int[][] c=new int[c1][r2];
        
        System.out.println("Enter the elements of A:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=in.nextInt(); 
            }
        }
        System.out.println("Enter the elements of B:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Product matix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
            }
}