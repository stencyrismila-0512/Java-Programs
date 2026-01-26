import java.util.Scanner;
class neon{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sq = n * n;
        int sum = 0;

        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }

        System.out.println(sum == n ? "Neon Number" : "Not Neon");
    }
}
