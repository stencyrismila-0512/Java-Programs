import java.util.Scanner;
class rightrotaterow{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[][] a=new int[3][4];
        System.out.println("Enter elements of array:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            leftrotation(a[i],i);
        }
        System.out.println("array after rotation:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void rightrotation(int[] row,int k){
        int n=row.length;
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=row[n-k+i];
        }
        for(int i=n-k-1;i>=0;i--){
            row[i+k]=row[i];
        }
        for(int i=0;i<k;i++){
            row[i]=temp[i];
        }
    }
}