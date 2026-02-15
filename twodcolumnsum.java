import java.util.Scanner;
class twodcolumnsum{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[][] a=new int[3][3];
        System.out.println("enter the elements of a:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=in.nextInt(); 
            }
        }
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a.length;j++){
                sum+=a[j][i];
            }System.out.println("Sum of column "+i+"is "+sum);
        }
            }
}