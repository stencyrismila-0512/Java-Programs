import java.util.Scanner;
class exp{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a :");
        a=in.nextInt();
        System.out.println("Enter b :");
        b=in.nextInt();
        System.out.println("Enter b :");
        c=in.nextInt();
        switch(a!=0 && b!=0 && c!=0){
            case (a>b && a>c):
                System.out.println("a is greater");
                break;
            case (b>a && b>c):
                System.out.println("b is greater");
                break;
            default:
                System.out.println("c is greater");

        }
    }
}