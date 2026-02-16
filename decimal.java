import java.util.Scanner;
class decimal{
    public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      System.out.println("Enter a decimal number:");
      int dec=in.nextInt();
      String hex=" ";
      while(dec>0){
         int rem=dec%16;
          if(rem<10){
              hex=rem+hex;
          }else if(rem>=10){
              hex=(char)((rem-10)+'A')+hex;
          }dec=dec/16;
      }
      System.out.println("Hexadecimal no:"+hex);
    }
}