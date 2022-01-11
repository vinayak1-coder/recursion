//Kth symbol in grammar
public class kth {
    public static int gra(int n,int k){
        if(n==1 && k==1)
            return 0;
        int mid = (int)Math.pow(2,n-1)/2;

        if(k<=mid)
            return gra(n-1,k);
        else
            return 1-gra(n-1,k-mid);
    }

    public static void main(String[] args) {
        int n=4;
        int k=5;
        System.out.println(gra(n,k));
    }
}
