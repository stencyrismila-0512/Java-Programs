import java.util.Scanner;
class octal{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int dec=in.nextInt();
        String oct=" ";
        while(dec>0){
            int rem=dec%8;
            if(rem<10)
            oct=rem+oct;
            dec=dec/8;

            }
        System.out.println("octal "+oct);
    }
}