class arrdel{
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};
        int p = 2;  
        if (p < 0 || p >= a.length) {
            System.out.println("\nInvalid position");
            return;
        }

        int[] b = new int[a.length - 1];
        for (int i = 0; i < p; i++)
            b[i] = a[i];
        for (int i = p; i < b.length; i++)
            b[i] = a[i + 1];

        System.out.print("\nAfter Deletion: ");
        for (int x : b)
            System.out.print(x + " ");
    }
}
