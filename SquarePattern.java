import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square (N): ");
        int N = scanner.nextInt(); 

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print("* "); 
            }
            System.out.println();
        }

        scanner.close(); 
    }
}
