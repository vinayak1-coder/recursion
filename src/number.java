import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        number nu = new number();
        nu.num(1,n);

    }
    public static void num(int i, int n){
        if(i<=n) {
            System.out.println(i);
        }
        else
            return;
        num(i+1,n);
        return ;
    }
}
