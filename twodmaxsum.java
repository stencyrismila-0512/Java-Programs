import java.util.Scanner;
class twodmaxsum{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[][] a=new int[3][3];
        System.out.println("enter the elements of a:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=in.nextInt(); 
            }
        }
        int max=0;
        int row=-1;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a.length;j++){
                sum+=a[i][j];
            }
            if(sum>max){
                max=sum;
                row++;
            }
        }
        System.out.println("Row with maximum sum:"+(row+1));
        System.out.println("Maximum row :"+max);
            }
}