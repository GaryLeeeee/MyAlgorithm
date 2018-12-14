package leetcode.easy;

import leetcode.structure.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by GaryLee on 2018-11-06 08:43.
 * 160.相交链表(https://leetcode-cn.com/problems/intersection-of-two-linked-lists/)
 */
public class Code160 {
    //将A所有结点存放到List,遍历B查找List中是否包含即可
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> listNodes = new ArrayList<>();
        while(headA!=null){
            listNodes.add(headA);
            headA = headA.next;
        }
        while(headB!=null){
            if(listNodes.contains(headB))
                return headB;
            headB = headB.next;
        }
        return null;
    }
    //因为A、B在相交后是等长的，所以可以先将A、B执行next操作到等长，再一个个判断是否相同即可
    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        int count1 = 0,count2 = 0;
        ListNode p1 = headA;
        ListNode p2 = headB;
        while(p1!=null||p2!=null){
            if(p1!=null){
                p1 = p1.next;
                count1++;
            }
            if(p2!=null){
                p2 = p2.next;
                count2++;
            }
        }
        while(count1!=count2){
            if(count1>count2){
                headA = headA.next;
                count1--;
            }else {
                headB = headB.next;
                count2--;
            }
        }
        while(headA!=null&&headB!=null){
            if(headA==headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);
        ListNode headB = new ListNode(11);
        headB.next = new ListNode(12);
        headB.next.next = new ListNode(13);
        headB.next.next.next = headA.next.next;
        headB.next.next.next.next = headA.next.next.next;
        headB.next.next.next.next.next = headA.next.next.next.next;
        ListNode listNode = getIntersectionNode(headA,headB);
        System.out.println(listNode.val);
        ListNode listNode2 = getIntersectionNode(headA,headB);
        System.out.println(listNode2.val);
    }
}
