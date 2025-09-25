public class Calculator {

    public int subtract(int a, int b) {
        return a - b;
    }

    public int add(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        return a + b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("5 - 3 = " + calc.subtract(5, 3));
    }
}