import java.util.Scanner;
class twodarr{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[][] a=new int[3][];
        int r,c;
        System.out.println("Enter r:");
        r=in.nextInt();
        for(int i=0;i<r;i++){
            System.out.println("Enter c:");
            c=in.nextInt();
            a[i]=new int[c];
            System.out.println("Enter elements of "+c);
            for(int j=0;j<c;j++){
                a[i][j]=in.nextInt(); 
            }
        }
        System.out.println("Matrix:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
            }
}