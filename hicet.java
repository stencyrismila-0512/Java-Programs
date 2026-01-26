import java.util.Scanner;
class hicet{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the no of students placed in CSE:");
        a=in.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        b=in.nextInt();
        System.out.println("Enter the no of students placed in MECH");
        c=in.nextInt();
        System.out.println("Highest placement");
        if (a<0 || b<0 || c<0) {
            System.out.println("Input is Invalid");
        }else if(a==b || b==c && a==c) {
            System.out.println("None of the dept has got highest placement");
        }
        else if(a>b){
            if(a>c){
                System.out.println("CSE");
            }
            else{
                System.out.println("MECH");
            }
        }else{
            if(b>c){
                System.out.println("ECE");
            }
            else{
                System.out.println("MECH");
            }
        }
            
            }
}