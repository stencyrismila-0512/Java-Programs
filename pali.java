import java.util.Scanner;
class pali{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=in.nextInt();
        int original=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(original==rev)
        System.out.println("The number is palindrome");
        else
        System.out.println("Not a palindrome");
    }
}