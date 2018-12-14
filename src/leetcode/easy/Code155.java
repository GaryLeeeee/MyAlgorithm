package leetcode.easy;

import java.util.Stack;

/**
 * Created by GaryLee on 2018-11-01 19:17.
 * 155.最小栈(https://leetcode-cn.com/problems/min-stack/)
 */
public class Code155 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("测试:"+minStack.minStack);
        System.out.println(minStack.getMin()); //返回 -3.
        minStack.pop();
        System.out.println(minStack.top());//返回 0.
        System.out.println(minStack.getMin());// 返回 -2.
    }
}
class MinStack {
    private Stack<Integer> stack = new Stack<>();
    public Stack<Integer> minStack = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()||minStack.peek()>=x)
            minStack.push(x);
    }

    public void pop() {
        int x = stack.pop();
        if(minStack.peek()==x)
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
