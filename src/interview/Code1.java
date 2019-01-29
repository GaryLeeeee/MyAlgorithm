package interview;

import leetcode.structure.ListNode;

/**
 * Created by GaryLee on 2019-01-30 00:46.
 * 查找链表倒数第k个元素
 * 1 2 3 4 5 6 7 8 9
 * 1
 *       4
 */
public class Code1 {
    public static ListNode search(ListNode listNode,int k){
        ListNode p,q;
        p = q = listNode;
        for(int i=0;i<k-1;i++){
            q = q.next;
        }
        while((q = q.next)!=null){
            p = p.next;
        }
        return p;

    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        int num = 10;
        int index = 0;
        ListNode first = listNode;
        while((--num)>0){
            first.next = new ListNode(++index);
            first = first.next;
        }
//
//        while(listNode!=null){
//            System.out.println(listNode.val);
//            listNode = listNode.next;
//        }
        //初始化0-9完毕
        ListNode node = search(listNode,4);
        System.out.println(node.val);

    }
}
