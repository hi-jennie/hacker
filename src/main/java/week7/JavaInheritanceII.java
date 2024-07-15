package week7;

public class JavaInheritanceII {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("My superclass is Arithmetic");
        System.out.println(adder.add(21, 21) + " " + adder.add(3, 10) + " " + adder.add(10, 10));
    }

    static class Arithmetic {
        int add(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {

    }
}
