import java.util.Scanner;
class rowchange{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[][] a=new int[3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=in.nextInt(); 
            }
        }
        int lastrow=a.length-1;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==0){
                    int temp=a[i][j];
                    a[i][j]=a[lastrow][j];
                    a[lastrow][j]=temp;
                    
            }
        }
        System.out.println("Matrix:");
        for( i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
            }
}
}