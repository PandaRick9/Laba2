import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("User Input Application");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}
