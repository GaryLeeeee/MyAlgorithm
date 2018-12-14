package leetcode.easy;

import leetcode.structure.ListNode;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by GaryLee on 2018-11-01 16:04.
 * 141.环形链表(https://leetcode-cn.com/problems/linked-list-cycle/)
 */
public class Code141 {
    //哈希表(每个结点存到Set集合中，如重复出现则为环)
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> listNodes = new LinkedHashSet<>();
        while (head!=null){
            if(!listNodes.contains(head)) {
                listNodes.add(head);
                head = head.next;
            } else
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(4);
        listNode.next.next.next = listNode.next;
        System.out.println(hasCycle(listNode));
    }
}
