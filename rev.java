import java.util.Scanner;
class rev{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number tgo reverse");
        int n=in.nextInt();
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
        }
        System.out.println("The reverse of the number is "+rev);
            }
}