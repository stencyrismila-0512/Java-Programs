import java.util.Scanner;
class strong{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp = n, sum = 0;

        while (n > 0) {
            int d = n % 10;
            int fact = 1;

            for (int i = 1; i <= d; i++)
                fact *= i;

            sum += fact;
            n /= 10;
        }

        System.out.println(sum == temp ? "Strong Number" : "Not Strong");
    }
}
