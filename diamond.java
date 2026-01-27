import java.util.Scanner;

class diamond{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {

            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
