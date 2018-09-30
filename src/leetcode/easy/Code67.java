package leetcode.easy;

/**
 * Created by GaryLee on 2018-09-25 09:42.
 * 67.二进制求和(https://leetcode-cn.com/problems/add-binary/)
 * 0 1 2 3 4
 *     0 1 2
 */
public class Code67 {
    //自己写的,以两字符串最长length进行循环，短的字符串高位用0补上
    // 0 1 2 3 4
    //     0 1 2
    public static String addBinary(String a, String b) {
        int carry = 0;
        int max = Math.max(a.length(),b.length());
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=max-1;i>=0;i--){
            int num1 = ((i-(max-a.length()))>=0?a.charAt(i-(max-a.length())):'0') - '0';
            int num2 = ((i-(max-b.length()))>=0?b.charAt(i-(max-b.length())):'0') - '0';
            int sum = num1 + num2 + carry;
            carry = (sum / 2);
            stringBuilder.insert(0,sum%2);//每次都添加到最前
        }
        if(carry>0)
            stringBuilder.insert(0,carry);//判断最后是否还有进位
        return stringBuilder.toString();
    }
    //例子，原理类似，用while循环，为空位则返回0，用StringBuilder进行append操作，最后再一次性反转(reverse)
    public static String addBinary2(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while(i>=0||j>=0){
            int sum = carry;
            int temp = 0;
            temp = (i>=0)?a.charAt(i--)-'0':0;
            sum += temp;
            temp = (j>=0)?b.charAt(j--)-'0':0;
            sum += temp;
            stringBuilder.append(sum%2);;
            carry = sum/2;
        }
        if(carry!=0)
            stringBuilder.append(carry);
        return stringBuilder.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println("result1:"+addBinary(a,b));
        System.out.println("result2:"+addBinary2(a,b));
    }
}
