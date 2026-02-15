import java.util.Scanner;
class nestedloop{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(9+" ");
            }
        System.out.println(" ");
        }
    }
}