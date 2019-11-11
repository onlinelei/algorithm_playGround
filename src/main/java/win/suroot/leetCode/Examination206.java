package win.suroot.leetCode;


/**
 * @author qianlei
 * @create 2019-11-09 23:00
 * @desc
 */
public class Examination206 {

    /**
     * 反转一个单链表。
     * <p>
     * 示例:
     * <p>
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     * 进阶:
     * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
     *
     * @author: qianlei
     * @date: 2019-11-09 23:55
     */
    public static ListNode reverseList(ListNode head) {
        ListNode next = head.next;
        if (next.next == null) {
            next.next = head;
            return head;
        } else {
            reverseList(next);
        }
        return head;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
