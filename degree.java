import java.util.Scanner;
class degree{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter value in celcius;");
        float cel=in.nextFloat();
        float fah=cel*(9/5)+32;
        System.out.println("Fahrenheit value:"+fah);
    }
}