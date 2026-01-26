import java.util.Scanner;
class jump2{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0)
            continue;
            else
            System.out.println(i);
        }
    }
}