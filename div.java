import java.util.Scanner;
class div{
    public static void main(String[] args){
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        n=in.nextInt();
        if(n%17==0)
        System.out.println("Number is divisible by 17");
    }
}