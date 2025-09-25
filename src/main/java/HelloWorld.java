import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Calculator Application");

        Calculator calc = new Calculator();
        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
    }
}
