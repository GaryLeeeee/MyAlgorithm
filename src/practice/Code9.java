package practice;

/**
 * Created by GaryLee on 2019-08-10 22:09.
 * 剑指offer-变态跳台阶
 * 比如普通的跳台阶(Code8)
 */
public class Code9 {
    //f(4)=f(4-1)+f(4-2)+f(4-3)+f(4-4)
    //就比如第四阶的话是第4-1(=3)阶跳1阶，4-2(=2)阶跳2阶，4-3(=1)阶跳3阶，4-4(=0)阶跳4阶
    public int JumpFloorII(int target) {
        //前两阶直接计算，方便后面计算
        if(target==1 || target==2)
            return target;

        /**
         * 动态规划重点
         * 弄数组放第n阶的n种情况
         */
        int[] floors = new int[target];
        floors[0] = 1;
        floors[1] = 2;

        for(int i=2;i<target;i++){
            //遍历这些每一阶的情况(用来走m阶数到当前阶)
            for(int j=0;j<i;j++){
                floors[i]+=floors[j];
            }
            //加一种从起点直接跨
            floors[i]++;
        }
        return floors[target-1];
    }
}
