package data_structure;

/**
 * @author rd_qinglin_mu
 * @description calendar class
 * @单据标识
 * @date 2024/5/26 16:01
 **/
class Calendar {
    public static String findDay(int month, int day, int year) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        // 注意，Calendar 类的月份是从 0 开始的，所以我们需要将输入的月份减 1。
        calendar.set(year, month - 1, day);
        // 获取了 Calendar 对象的星期几。get() 方法返回的是一个整数，表示星期几，其中 1 表示星期日，2 表示星期一，以此类推，7 表示星期六。
        // 获得我们设置的日期的星期数，但是是int类型，所以我们需要转换成字符串
        int dayOfWeek = calendar.get(java.util.Calendar.DAY_OF_WEEK);
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[dayOfWeek - 1];
    }

}
