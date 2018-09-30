package leetcode.easy;

/**
 * Created by GaryLee on 2018-09-25 00:51.
 * 58.最后一个单词的长度(https://leetcode-cn.com/problems/length-of-last-word/)
 */
public class Code58 {
    public static int lengthOfLastWord(String s) {
        if(s.trim().isEmpty())
            return 0;
        String[] str = s.split(" ");
        return str[str.length-1].length();
    }

    public static void main(String[] args) {
        String s = "  ";
        System.out.println(lengthOfLastWord(s));
    }
}
