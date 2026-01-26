import java.util.Scanner;
class jump3{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            if(i==8)
            return;
            else
            System.out.println(i);
        }
    }
}