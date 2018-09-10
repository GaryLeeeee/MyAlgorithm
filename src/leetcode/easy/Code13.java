package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GaryLee on 2018-09-05 21:43.
 *  13. 罗马数字转整数(https://leetcode-cn.com/problems/roman-to-integer/description/)
 *
 *  描述:通常情况下，罗马数字中小的数字在大的数字的右边。(更多详见网站描述)
 *
 *  示例 1:
 *  输入: "IV"
 *  输出: 4
 *  示例 4:
 *  输入: "LVIII"
 *  输出: 58
 *  解释: C = 100, L = 50, XXX = 30, III = 3.
 */
public class Code13 {
    static class Solution4 {
        //思路:通常情况下左边的数比右边大，所以进行判断，如果左边数大于右边数，则输出加上左边数，否则减去左边数
        //     到最后一个数则直接加上
        public int romanToInt(String s) {
            Map<Character,Integer> map = new HashMap<>();
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
            int result = 0;
            for(int i=0;i<s.length();i++){
                if(i==s.length()-1||map.get(s.charAt(i))>=map.get(s.charAt(i+1)))
                    result += map.get(s.charAt(i));
                else
                    result -= map.get(s.charAt(i));
            }
            return result;
        }
    }

    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println("result:"+new Solution4().romanToInt(s));
    }
}
