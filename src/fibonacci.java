import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(print(n));

    }
    public static int print(int n ){
        //int last,slast;
        if(n<=1){
            return n;
        }
//        else {
//            last = print(n - 1);
//            slast = print(n - 2);
//        }
        return print(n-1)+print(n-2);
    }
}
