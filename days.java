import java.util.Scanner;
class days{
    public static void main(String[] args) {
        Scanner no=new Scanner(System.in);
        System.out.println("Enter the number:");
        int day=no.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid number");
        }
    }}
