import java.util.Scanner;
class oddeven{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter a no");
        int n=in.nextInt();
        if(n%2==0)
        System.out.println("even no");
        else
        System.out.println("odd no");
    }
}