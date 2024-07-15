package week7;

public class MethodOverride {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.hello();
    }

    static class cycle {
        void hello() {
            System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
        }
    }

    static class Motorcycle extends cycle {
        @Override
        void hello() {
            System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
            super.hello();
        }
    }
}
