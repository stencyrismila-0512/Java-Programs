import java.util.Scanner;
class loop{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a no ");
        int n=in.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print(i+"*"+n+"=");
            System.out.println(i*n);
        }
    }
}      