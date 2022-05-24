import java.util.Scanner;

public class pellindrom {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n =sc.nextInt();
        pellindrom pd = new pellindrom();
        int temp = pall(0,n);
        if(temp==n){
            System.out.println("yes");
        }
        else
            System.out.println("no");

    }
    public static int pall(int i, int n){
        if(n==0){
            return i;
        }
        else
            i=(i*10)+(n%10);
        return pall(i,n/10);
    }
}
