package leetcode.easy;

/**
 * Created by GaryLee on 2018-09-24 00:25.
 * 38.报数(https://leetcode-cn.com/problems/count-and-say/description/)
 */
public class Code38 {
    public static String countAndSay(int n) {
        if(n==1)
            return "1";
        String str = countAndSay(n-1);
        StringBuilder stringBuilder = new StringBuilder();//可变的字符序列(append等)
        char first = str.charAt(0);
        int num = 0;
        for(int i = 0;i < str.length();i++) {
            if(str.charAt(i)==first){
                num++;
            }else{
                //如果循环到的数与前面的不一致，则先统计前面数，再修改first为当前数(num清为1)
                stringBuilder.append(num).append(first);
                first = str.charAt(i);
                num = 1;
            }
            //判断如果是最后一位，则立刻执行append操作
            if(i==str.length()-1)
                stringBuilder.append(num).append(first);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(10));
    }
}
