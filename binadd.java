import java.util.Scanner;
class binadd{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        int n1=s1.length()-1;
        int n2=s2.length()-1;
        int num=0;
        int carry=0;
        String sum=" ";
        while(n1>=0||n2>=0||carry==1){
            num=0;
            if(n1>=0&&n2>=0)
            num=(s1.charAt(n1)-'0')+(s2.charAt(n2)-'0')+carry;
            else if(n1>=0)
            num=(s1.charAt(n1)-'0')+carry;
            else if(n2>=0)
            num=(s2.charAt(n2)-'0')+carry;
            else 
            num=carry;
            carry=num/2;
            num=num%2;
            sum=num+sum;
            n1--;
            n2--;
        }
        System.out.println("Sum = "+sum);
    }
}