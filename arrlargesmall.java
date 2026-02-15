import java.util.Scanner;
class arrlargesmall{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[][] a=new int[3][3];
        System.out.println("enter the elements of a:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=in.nextInt(); 
            }
        }
        int large=0;
        int small=a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]>=large){
                    large=a[i][j];
                }else if(a[i][j]<=small){
                    small=a[i][j];
                }
            }
        }
        
        System.out.println("Largest "+large);
        System.out.println("smallest "+small);
            }
}