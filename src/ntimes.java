import java.util.Scanner;

public class ntimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        ntimes obj = new ntimes();
        obj.name(n,1,s);

    }
    public static void name(int n,int i,String s){
        if(i>n){
            return;
        }
        else
            System.out.println(s);
        name(n,i+1,s);

    }
}
