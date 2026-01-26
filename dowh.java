import java.util.Scanner;
class dowh{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=in.nextInt();
        int i=2;
        do{
            System.out.println(i);
            i=i+2;
        }while(i<=n);
    }
}