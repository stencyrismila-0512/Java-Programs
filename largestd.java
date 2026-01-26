import java.util.Scanner;
class largestd{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;

        while (n > 0) {
            int d = n % 10;
            if (d > max)
                max = d;
            n /= 10;
        }

        System.out.println("Largest digit = " + max);
    }
}
