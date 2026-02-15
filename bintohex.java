import java.util.Scanner;
class bintohex{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String bin=in.nextLine();
        String hex=" ";
        int value;
        while(bin.length()%4!=0)
        {
            bin='0'+bin;
        }
        for(int i=0;i<bin.length();i=i+4){
            value=0;
            value+=(bin.charAt(i)-'0')*8;
            value+=(bin.charAt(i+1)-'0')*4;
            value+=(bin.charAt(i+2)-'0')*2;
            value+=(bin.charAt(i+3)-'0')*1;
            hex=hex+value;
        }
        System.out.println("hexadecimal= "+hex);
         
    }
}