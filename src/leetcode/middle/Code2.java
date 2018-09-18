package leetcode.middle;

import leetcode.structure.ListNode;

/**
 * Created by GaryLee on 2018-09-18 09:17.
 * 2. 两数相加(https://leetcode-cn.com/problems/add-two-numbers/description/）
 */
public class Code2 {
    //不能将两个链表转换成对应的整数然后相加，再转换为链表，有可能会出现"溢出"
    //思路:将每个链表进行循环判断，如果不为空则返回对应val，否则为0
    //     和大于10则进位为1,当前位为和的个位数
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstNode = new ListNode(0);//头结点
        ListNode tempNode = firstNode;//指向头结点
        int carry = 0;//存储进位
        while (l1 != null || l2 != null) {
            //判断各位上的数，默认为0
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            tempNode.next = new ListNode(sum % 10);
            tempNode = tempNode.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry > 0)
            tempNode.next = new ListNode(carry);//最高位如果还有进位就追加一个val为carry的结点
        return firstNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(6);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.print(listNode.val);
        while (listNode.next != null) {
            System.out.print("->"+listNode.next.val);
            listNode = listNode.next;
        }

    }
}

