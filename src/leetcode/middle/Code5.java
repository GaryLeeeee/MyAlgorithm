package leetcode.middle;

/**
 * Created by GaryLee on 2019-08-09 15:46.
 * 5. 最长回文子串(https://leetcode-cn.com/problems/longest-palindromic-substring/)
 */
public class Code5 {
    //动态规划(记录状态，向外扩展)
    public String longestPalindrome(String s) {
        int len = s.length();
        //如果长度为0或为1，则肯定为回文
        if(len<=1)
            return s;
        int max = 1;//能运行到这里肯定是大于1的，所以max不用设为0
        String longestPalindrome = s.substring(0,1);//如abcde返回a
        //动态规划记录状态用
        boolean[][] ifTrue = new boolean[len][len];
        //注意charat就当前，substring就[)
        /**
         * !!!!!!!!!
         * 这里应该r包在l外面否则会出错误
         * 比如注释掉的aaaa会去判断中间aa(1,2)是否回文，但此时外层循环还在(0,1),(0,2),(0,3)循环，没到(1,*)
         * 所以按照新的方法就
         * (0,1),(0,2),(0,3)  ->    (0,1)
         * (1,2),(1,3)        ->    (0,2),(1,2)
         * (2,3)              ->    (0,3),(1,3),(2,3)
         * 就不会出现isTrue判断的时候还没运算到
         */
//        for(int l=0;l<len;l++){
        for(int r=1;r<len;r++){
//            for(int l=0;r<len;r++){
            for(int l=0;l<r;l++){
                //通过前面判断后
                //如果长度在3以内就肯定是回文，不用再看ifTrue状态
                //如a,bb,bab
                //所以等长度为4以后的才判断里面是不是回文，如abaa判断ba是不是回文
                if(s.charAt(l)==s.charAt(r) && (r-l<=2||ifTrue[l+1][r-1])){//如果两端相同，就再看看子串两端相同吗(有状态)
                    //记录当前状态
                    ifTrue[l][r] = true;//说明l到r的子串是回文子串
                    //看看当前子串比已记录最长子串
                    if(r-l+1>max){
                        max = r-l+1;
                        longestPalindrome = s.substring(l,r+1);
                    }
                }
            }
        }
        return longestPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(new Code5().longestPalindrome("aaaa"));
    }
}
