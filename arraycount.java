import java.util.Scanner;
class arraycount{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] a= new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        int even=0,odd=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even++;
            }
            else
            odd++;
        }
        System.out.println("Odd count:"+odd);
        System.out.println("Even count: "+even);
    }
}