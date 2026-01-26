import java.util.Scanner;
class bike{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int speed;
        System.out.println("Enter speed:");
        speed=in.nextInt();
        if(speed<=60)
        System.out.println("No fine");
        else if(speed>=61&&speed<=80)
        System.out.println("Rs.500 fine");
        else if(speed>=81&&speed<=100)
        System.out.println("Rs.2000 fine");
        else if(speed>=101&&speed<=120)
        System.out.println("Rs.5000 fine");
        else
        System.out.println("License suspended");
    }
}