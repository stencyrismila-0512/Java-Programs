import java.util.Scanner;

class arms{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, d, sum = 0, temp, count = 0;

        System.out.println("Enter your num : ");
        a = in.nextInt();

        temp = a;

        
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = a;

        
        while (a > 0) {
            d = a % 10;
            sum = sum + (int)Math.pow(d, count);
            a = a / 10;
        }

        if (sum == temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}