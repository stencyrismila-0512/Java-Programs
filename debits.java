import java.util.Scanner;
class debits{
    public static void main(String[] args){
        int amt;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter amount");
        amt=in.nextInt();
        if(amt>10000)
        System.out.println("debit 500");
        else
        System.out.println("debit 50");
}
}