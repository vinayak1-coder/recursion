import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        int sum1 = 0;
        sum s = new sum();
        s.add(0,i);

    }
    public static int add(int sum1 , int i){
        if(i<1){
            //add(sum1+i,i-1);
            System.out.println(sum1);
        }
        //else
            //return i;
        add(sum1+i,i-1);
        //System.out.println(sum1);
        return sum1;
    }
}
