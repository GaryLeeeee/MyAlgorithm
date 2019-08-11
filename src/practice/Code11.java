package practice;

/**
 * Created by GaryLee on 2019-08-11 22:06.
 * 剑指offer-二进制中1的个数
 * 这道题看的还是对二进制，原码补码是否熟悉
 * 常规的用n去除以2一直计算也许可以，但负数就不好算了
 * 所以直接用二进制的与运算&
 * ！！！！！多看！比较少看的题型！！
 */
public class Code11 {
    public int NumberOf1(int n) {
        //计算1的个数
        int count = 0;
        //当不为0的时候，计算1的个数，每计算一个移除
        while(n!=0){
            //每次计算完1后就与一个(n-1)就可以把该1去掉，并不会影响到其他位置
            //比如1101 1100
            //去1后1101 1011
            //与后1101 1000(这样的话最后面的1就没有了，其他同理)
            n&=(n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
