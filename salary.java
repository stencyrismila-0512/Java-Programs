import java.util.Scanner;
class salary{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int scope,hike,sal;
        System.out.println("Enter your performance scope:");
        scope=in.nextInt();
        System.out.println("Enter your salary:");
        sal=in.nextInt();
        if(scope>=90){
        hike=sal*15/100;
        sal=sal+hike;
        System.out.println("your salary hike "+sal);
        }
        else if(scope>=80){
        hike=sal*20/100;
        sal=sal+hike;
        System.out.println("your salary hike "+sal);
        }
        else if(scope>=70){
        hike=sal*8/100;
        sal=sal+hike;
        System.out.println("your salary hike "+sal);
        }
        else if(scope>=60){
        hike=sal*5/100;
        sal=sal+hike;
        System.out.println("your salary hike "+sal);
        }
        else
        System.out.println("your salary "+sal);
    }
}