
import java.util.Arrays;
import java.util.List;

    public class dataType {
        private static final List<Integer> DateArray = Arrays.asList(702, 1082, 1083, 1114, 1184, 1266, 12403);
        private static final List<Integer> numericArray = Arrays.asList(20, 21, 23, 24, 26, 700, 701, 790, 1700, 2202, 2203, 2204, 2205, 2206, 3724, 2769, 12396);

        public static void main(String[] args) {
            System.out.println(dataType.gd(20));
            System.out.println(dataType.gd(702));
            System.out.println(dataType.gd(0));
        }
        public static String gd(int code){
            if (DateArray.contains(code)) {
                return "DATE";
            } else if (numericArray.contains(code)) {
                return "NUMERIC";
            }
            return "STRING";
        }
    }
