package leetcode.easy;

/**
 * Created by GaryLee on 2018-12-15 18:19.
 * 292.Nim游戏(https://leetcode-cn.com/problems/nim-game/)
 * 123
 */
public class Code292 {
    public static boolean canWinNim(int n) {
        return n%4!=0;
    }

    public static void main(String[] args) {
        System.out.println(canWinNim(1));
        System.out.println(canWinNim(4));
        System.out.println(canWinNim(5));
        System.out.println(canWinNim(6));
        System.out.println(canWinNim(7));
        System.out.println(canWinNim(8));
    }
}
