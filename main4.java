import java.util.Scanner;
class main4{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        char c;
        System.out.println("Enter a character:");
        c=in.nextLine().charAt(0);
        switch(c){
            case 'm':
                System.out.println("Monday");
                break;
            case 't':
                System.out.println("Tuesday");
                break;
            case 'u':
                System.out.println("Thursady");
                break;
            case 's':
                System.out.println("Saturday");
                break;
            case 'w':
                System.out.println("Wednesday");
                break;
            case 'f':
                System.out.println("Friday");
                break;
            case 'r':
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}