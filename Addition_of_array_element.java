package array;
import java.util.Scanner;

class Sum{
    Scanner sc = new Scanner(System.in);
    void totalSum(int n){
        int[] arr = new int[n];

        short sum = 0;

        System.out.println("enter total n number of array of element :");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            sum += arr[i];
        }

        System.out.println("the total sum of array element :\n"+sum);
    }
}
public class Addition_of_array_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 'n' number :");
        int n = sc.nextInt();

        Sum arr = new Sum();

        arr.totalSum(n);

    }
}
