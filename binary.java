import java.util.Scanner;
class binary{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int dec=in.nextInt();
        String bin=" ";
        while(dec>0){
            int rem=dec%2;
            if(rem<10)
            bin=rem+bin;
            dec=dec/2;

            }
        System.out.println("binary "+bin);
    }
}