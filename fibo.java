import java.util.Scanner;
class fibo{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=in.nextInt();
        int a=0;
        int b=1;
        int temp;
        for(int i=0;i<=n;i++){
            System.out.println(a+" ");
            temp=a+b;
            a=b;
            b=temp;
        }

        }
    }