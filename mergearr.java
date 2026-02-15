import java.util.*;
class mergearr{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] a=new int[5];
        int[] b=new int[5];
        System.out.println("Enter first array:");
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter second array:");
        for(int j=0;j<a.length;j++){
            b[j]=in.nextInt();
        }
        int[] c=new int[a.length+b.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            c[k]=a[i];
            k++;
        }
        for(int i=0;i<b.length;i++){
            c[k]=b[i];
            k++;
        }
        System.out.println("Merged array :");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}