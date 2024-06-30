package week6;

/**
 * @author rd_qinglin_mu
 * @description inheritance
 * @单据标识
 * @date 2024/6/30 23:10
 **/
public class JavaInheritance {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.walk();
        myBird.fly();
        myBird.sing();
    }

    static class Animal {
        void walk() {
            System.out.println("I am walking");
        }
    }

    // because Bird extends Animal, so Bird can also have access to the walk method
    // actually, subclass can inherit the methods and fields from the superclass（only the public and protected fields and methods）
    // private methods, static methods, and final methods, constructors cannot be inherited.
    // subclass can use the method of superclass directly by using the super keyword or override the method
    static class Bird extends Animal {
        void fly() {
            System.out.println("I am flying");
        }

        void sing() {
            System.out.println("I am singing");
        }
    }


}
