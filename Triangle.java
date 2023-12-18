public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a,int b,int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void S() {
        System.out.println(a * b / 2);
    }

    public void P() {
        System.out.println(a + b + c);

    }
    public float sinA(){
        System.out.println(b/a);
        return b/a;
    }
    public float cosA(){
        System.out.println(c/a);
        return c/a;
    }
    public float tgA(){
        System.out.println(b/c);
        return b/c;

    }
}
