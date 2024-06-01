package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author rd_qinglin_mu
 * @description Primality Test
 * @单据标识
 * @date 2024/6/1 14:54
 **/
public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        // BigInteger 可以将一个大于long的字符串，转成一个可以加减的数，但实质上还是string
        BigInteger bigInteger = new BigInteger(n);
        System.out.println(n);

        // isProbablePrime 判断是否是质数，返回boolean，参数表示进度，即这个数是质数的可靠程度
        if (bigInteger.isProbablePrime(2)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        // int result = Integer.valueOf(n);
        // Integer result = new Integer(n);


    }
}
