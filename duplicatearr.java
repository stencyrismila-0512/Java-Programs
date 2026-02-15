class duplicatearr{
    public static void main(String[] args){
        int[] a={1,2,3,5,3,7,1};
        System.out.println("Duplicate elements count ");
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
        }System.out.println(count);
    }
}