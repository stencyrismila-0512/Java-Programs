import java.util.Scanner;
class divisible{
    public static void main(String[] args){
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        a=in.nextInt();
        if(((a%5)==0)&&((a%7)==0))
        System.out.println(a+" is divisible by 5 & 7");
        else
        System.out.println(a+" is not divisible by 5 & 7");
    }
}