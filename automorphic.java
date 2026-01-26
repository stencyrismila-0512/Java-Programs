import java.util.Scanner;
class automorphic{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sq = n * n;
        int temp = n;

        while (temp > 0) {
            if (temp % 10 != sq % 10) {
                System.out.println("Not Automorphic");
                return;
            }
            temp /= 10;
            sq /= 10;
        }
        System.out.println("Automorphic Number");
    }
}
