import java.util.Scanner;
class twodarrsum{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[][] a=new int[2][2];
        System.out.println("enter the elements of a:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=in.nextInt(); 
            }
        }
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                sum+=a[i][j];
            }
        }
        System.out.println("Sum of elements :"+sum);
            }
}