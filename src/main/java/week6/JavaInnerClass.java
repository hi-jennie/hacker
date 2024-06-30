package week6;

/**
 * @author rd_qinglin_mu
 * @description notes about inner class
 * @单据标识
 * @date 2024/6/30 17:24
 **/
public class JavaInnerClass {
    // Member Inner Class——class that is written at the member level of another class.
    // Inside the outer class, we can access all the outer class's field and method directly
    public class OuterClassA {
        private final String outerField = "Outer field";

        public void main(String[] args) {
            OuterClassA outer = new OuterClassA();
            // member inner class can only be created using an instance of the outer class
            // in another word; before creating a member class,we need to create an instance of the outer class first
            OuterClassA.InnerClass inner = outer.new InnerClass();
            inner.printOuterField();
        }

        public class InnerClass {
            public void printOuterField() {
                System.out.println(outerField);
            }
        }
    }

    // pay attention to the difference between static inner class and member inner class
    // Static Inner Class
    // inside the static inner class, we can only have access to static fields and methods of the outer class
    public class OuterClass {
        private static final String outerStaticField = "Outer static field";

        public static void main(String[] args) {
            // we can create static inner class without creating an instance of the outer class
            OuterClass.StaticInnerClass inner = new OuterClass.StaticInnerClass();
            inner.printOuterStaticField();
        }

        public static class StaticInnerClass {
            public void printOuterStaticField() {
                System.out.println(outerStaticField);
            }
        }
    }

    // Local Inner Class - class that is defined inside a method.
    public class OuterClassB {
        private final String outerField = "Outer field";

        public void methodWithInnerClass() {
            //  we can only create an instance of LocalInnerClass inside the methodWithInnerClass method
            class LocalInnerClass {
                public void printOuterField() {
                    System.out.println(outerField);
                }
            }

            LocalInnerClass localInner = new LocalInnerClass();
            localInner.printOuterField();
        }
        // we can't create an instance of LocalInnerClass here
    }

    // Anonymous Inner Class
    public class OuterClassC {
        public void createInnerClass() {
            Runnable runnable = new Runnable() {
                // Runnable() is an interface, so we need to implement the run method
                // this anonymous inner class is an implementation of the Runnable interface
                // we can also use a superclass or interface to create an anonymous inner class
                @Override
                public void run() {
                    System.out.println("Anonymous Inner Class");
                }
            };

            Thread thread = new Thread(runnable);
            thread.start();
        }

    }


}
