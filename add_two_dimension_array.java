package array;
import java.util.Scanner;

public class add_two_dimension_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr;
        arr = new int[3][3];

        int[][] brr;
        brr = new int[3][3];

        int[][] result;
        result = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                brr[i][j] = sc.nextInt();
            }
        }
        System.out.println("result matrix is : ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print((result[i][j] = arr[i][j] + brr[i][j])+" ");
            }
            System.out.println();
        }
    }
}
