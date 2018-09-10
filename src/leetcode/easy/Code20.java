package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by GaryLee on 2018-09-06 22:12.
 * 20. 有效的括号(https://leetcode-cn.com/problems/valid-parentheses/description/)
 * 描述：给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 有效字符串需满足：
 左括号必须用相同类型的右括号闭合。
 左括号必须以正确的顺序闭合。
 注意空字符串可被认为是有效字符串。
 *
 * 示例：
 输入: "{[]}"
 输出: true
 */
public class Code20 {
    static class Solution6 {
        //以栈对输入的内容进行存储,当遇到一个右括号,则弹出一个元素并比较,如果对应则继续,否则直接返回false
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            Map<Character,Character> map = new HashMap<>();
            map.put('(',')');
            map.put('{','}');
            map.put('[',']');
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
                    stack.push(s.charAt(i));
                else if(!stack.empty()&&s.charAt(i)==map.get(stack.pop()))
                    continue;
                else
                    return false;
            }
            return stack.empty();
        }
    }
    public static void main(String[] args) {
        String s = "(";
        System.out.println("result:"+new Solution6().isValid(s));
    }
}
