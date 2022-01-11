import java.util.Scanner;

//Length of an array using recursion
public class stlength {
    public int arr(int[] array, int count ){
        if (array.length == 0){
            return 0;
        }

        else {
            count ++;

            //array.pop();
            return arr(array, count+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arra = new int[ 3];
        for (int i = 0; i < arra.length; i++)
        {
            System.out.println("Please enter number");
            arra[i] = (int) sc.nextDouble();
        }
        stlength obj = new stlength();

        obj.arr(arra,0);
        //System.out.println();
    }
}

