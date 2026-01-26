import java.util.Scanner;
class area1{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter radius:");
        double r=in.nextDouble();    
        double area=3.14*r*r;
        System.out.println("Area of circle:"+area);
        
    }
}