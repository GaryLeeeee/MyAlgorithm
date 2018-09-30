package leetcode.easy;

import leetcode.structure.ListNode;

/**
 * Created by GaryLee on 2018-09-26 14:13.
 * 83.删除排序链表中的重复元素(https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/)
 */
public class Code83 {
    public static ListNode deleteDuplicates(ListNode head) {
            ListNode listNode = head;//这一步到底是干啥用的呢
            while(listNode!=null&&listNode.next!=null){
                if(listNode.val==listNode.next.val)
                    listNode.next = listNode.next.next;
                else
                    listNode = listNode.next;
            }
            return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(2);


        System.out.print(listNode.val);
        System.out.print(" "+listNode.next.val);
        System.out.print(" "+listNode.next.next.val);
        System.out.println(" "+listNode.next.next.next.val);

        ListNode listNode1 = deleteDuplicates(listNode);
        System.out.print(listNode1.val);
        System.out.print(" "+listNode1.next.val);
        System.out.println(" "+listNode1.next.next.val);
//        System.out.println(listNode1.next.next.next.val);
    }
}
