package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        // 创建了一个 BufferedReader 对象，用于从标准输入（通常是键盘）读取数据。 和Scanner 类似，BufferedReader 也是用于读取输入的类，但 BufferedReader 的效率更高（）
        // ，BufferedReader的缺点是它的API相对较低级，使用起来可能不如Scanner那么方便。例如，如果你想从输入中读取不同类型的数据（如整数、浮点数、字符串等），你需要手动进行解析和转换，这可能会增加代码的复杂性
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // 和Sout相似，创建了一个 BufferedWriter 对象，用于向标准输出（通常是控制台）写入数据。
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // 这行代码读取了一行输入，去掉了行尾的空白字符，然后按照空格字符分割成了一个字符串数组。
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Calendar.findDay(month, day, year);
        System.out.println(res);
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}