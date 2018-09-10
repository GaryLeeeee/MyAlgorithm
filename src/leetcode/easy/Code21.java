package leetcode.easy;

import leetcode.structure.ListNode;

/**
 * Created by GaryLee on 2018-09-08 10:21.
 * 21. 合并两个有序链表(https://leetcode-cn.com/problems/merge-two-sorted-lists/description/)
 * 描述：将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例:
 输入：1->2->4, 1->3->4
 输出：1->1->2->3->4->4
 */
public class Code21 {
    static class Solution7 {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode listNode = new ListNode(0);
            ListNode firstNode = listNode;//头结点
            while(l1!=null&&l2!=null){
                if(l1.val<=l2.val){
                    listNode.next = l1;
                    listNode = listNode.next;
                    l1 = l1.next;
                }else {
                    listNode.next = l2;
                    listNode = listNode.next;
                    l2 = l2.next;
                }
            }
            if(l1==null&&l2!=null){
                listNode.next = l2;
            }
            if(l2==null&&l1!=null){
                listNode.next = l1;
            }
            return firstNode.next;
        }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l = new Solution7().mergeTwoLists(l1,l2);
        System.out.print(l.val);//先输出第一个的值
        while(l.next!=null){
            l = l.next;
            System.out.print("->"+l.val);
        }
    }
}
