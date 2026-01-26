import java.util.Scanner;
class leap{
    public static void main(String[] args){
        int yr;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a year:");
        yr=in.nextInt();
        if(yr%4==0&&yr%100!=0||yr%400==0)
        System.out.println("Leap year");
        else
        System.out.println("Not a leap year");
}
}