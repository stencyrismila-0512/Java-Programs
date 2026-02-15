class dupcount{
    public static void main(String[] args){
        int[] a={1,2,3,2,1,2,3,4};
        int c2=0;
        boolean[] v=new boolean[a.length];
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
            if(c1>=1){
                c1=1;
                c2=c1+c2;
            }
        }
        System.out.println("Count="+c2);
    }
}