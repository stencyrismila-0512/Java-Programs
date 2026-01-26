import java.util.Scanner;
class student{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int percentage,attendance;
        System.out.println("Enter percentage:");
        percentage=in.nextInt();
        System.out.println("Enter attendance:");
        attendance=in.nextInt();
        if(percentage>=85&&attendance>=90)
        System.out.println("Distinction");
        else if(percentage>=70&&attendance>=80)
        System.out.println("First class");
        else if(percentage>=60&&attendance>=75)
        System.out.println("Second class");
        else if(percentage>=50&&attendance>=75)
        System.out.println("Pass");
        else
        System.out.println("Fail");
    }
} 