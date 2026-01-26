class greatest{
    public static void main(String[] args) {
        int a=23, b=46, c=28;
        int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(max);
    }
}