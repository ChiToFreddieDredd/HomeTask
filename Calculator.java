public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int multiply(int a, int b) {
        System.out.println(a*b);
        return a*b;
    }

    public int addition(int a, int b) {
        System.out.println(a+b);
        return a + b;

    }
}
