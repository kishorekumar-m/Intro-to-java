import java.util.Scanner;

public class reverseString {

    public static void main(String[] args) {
        String str, reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        str = scanner.nextLine();

        int length = str.length();

        for (int i = length - 1; i >= 0; i--)
        reverse = reverse + str.charAt(i);

        if (str.equals(reverse))
        System.out.println("YES");
        else
        System.out.println("NO");
        scanner.close();
    }
}