import java.util.Scanner;
class lcm{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM = " + lcm);
    }

    static int gcd(int a, int b) {
        a=Math.abs(a);
        b=Math.abs(b);
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
