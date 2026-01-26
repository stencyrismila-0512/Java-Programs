import java.util.Scanner;
class peri{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the sides:");
        float a,b,c;
        a=in.nextFloat();
        b=in.nextFloat();
        c=in.nextFloat();
        float perimeter=a+b+c;
        System.out.println("Perimeter of triangle:"+perimeter);

    }
}