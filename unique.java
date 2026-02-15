class unique{
    public static void main(String[] args){
        int[] a={1,2,2,1,2,1};
        int c2=0;
        boolean[] v=new boolean[a.length];
        System.out.println("Unique elements are");
        for(int i=0;i<a.length;i++){
            if(v[i]==true)
            continue;
            int c1=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c1+=1;
                    v[j]=true;
                }
            }
            if(c1==0){
               System.out.println(a[i]);
            }
        }
    }
}