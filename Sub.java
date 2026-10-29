import java.util.Scanner;

public class Sub {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd number:");
        int b = sc.nextInt();

        int sub = a - b;

        System.out.println("Difference of these numbers:" + sub);

        sc.close();

    }
}