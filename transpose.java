import java.util.Scanner;
class transpose{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[][] a=new int[3][3];
        int[][] t=new int[3][3];
        System.out.println("Enter the elements of A : ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=in.nextInt(); 
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                t[i][j]=a[j][i];
            }
        }
        System.out.println("Matrix:");
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t.length;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
            }
}