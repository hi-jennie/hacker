package week6;


/**
 * @author rd_qinglin_mu
 * @description 泛型
 * @单据标识
 * @date 2024/6/27 14:56
 **/
public class JavaGenerics {
    public static void main(String[] args) {
        // because of the generic type,and Java doesn't support a primitive type for generic type,
        // so we use Integer instead of int
        Integer[] intArr = {1, 2, 3};
        // there are auto-boxing and auto-unboxing in Java
        // Integer number = 5; // auto-boxing
        // int b = number; // auto-unboxing

        String[] strArr = {"Hello", "World"};
        printArray(intArr);
        printArray(strArr);
    }

    // generic method--T[] represent printArray method can accept any type of array (String[], Integer[], etc.)
    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
}
// The following code is an example of a generic class:
//public class Box<T> {
//    private T value;
//
//    public void set(T value) {
//        this.value = value;
//    }
//
//    public T get() {
//        return this.value;
//    }
//}

//  Box<Integer> intBox = new Box<>();