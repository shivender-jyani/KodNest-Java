import java.util.Scanner;

public class TwoDiArray{
    public static void main(String[] args) {
        int arr[][] = new int[3][5];
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Array elements: ");
        for(int i=0;i<=2;i++){
            for(int j=0;j<=4;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Array elements are: ");
        for(int i=0;i<=2;i++){
            for(int j=0;j<=4;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}