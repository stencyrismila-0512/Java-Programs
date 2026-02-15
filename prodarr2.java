class prodarr2{
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};

        for (int i = 0; i < a.length; i++) {
            int prod = 1;

            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    prod = prod * a[j];
                }
            }

            System.out.println("Product except " + a[i] + " = " + prod);
        }
    }
}
