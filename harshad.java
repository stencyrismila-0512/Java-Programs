import java.util.Scanner;
class harshad{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum = 0;

        for (int i = n; i > 0; i /= 10)
            sum += i % 10;

        System.out.println(n % sum == 0 ? "Harshad Number" : "Not Harshad");
    }
}
