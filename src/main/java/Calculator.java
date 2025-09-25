public class Calculator {

    public int add(int a, int b) {
        System.out.println("Adding: " + a + " + " + b);
        int result = a + b;
        System.out.println("Result: " + result);
        return result;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("5 - 3 = " + calc.subtract(5, 3));
    }
}