import java.util.Scanner;
class longint{
    public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      System.out.println("Enter first number:");
      String num1=in.nextLine();
      System.out.println("Enter second number:");
      String num2=in.nextLine();
      String result=" ";
      int carry=0;
      int n1=num1.length()-1;
      int n2=num2.length()-1;
      while(n1>=0||n2>=0||carry>0){
          int digit1 = (n1 >= 0) ? num1.charAt(n1) - '0' : 0;
            int digit2 = (n2 >= 0) ? num2.charAt(n2) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            result = (sum % 10) + result;  // add digit to front
            carry = sum / 10;
            n1--;
            n2--;
      }
      System.out.println("Sum "+result);
    }
}