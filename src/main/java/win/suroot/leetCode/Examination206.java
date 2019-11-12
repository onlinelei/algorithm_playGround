package win.suroot.leetCode;


/**
 * @author qianlei
 * @create 2019-11-09 23:00
 * @desc
 */
public class Examination206 {

    /**
     * 反转一个单链表。
     * 示例:
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     * 进阶:
     * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
     */


    /**
     * @author: qianlei
     * @date: 2019-11-12 11:11
     */
    public static ListNode reverseList(ListNode head) {
        return each(head, null);
    }

    private static ListNode each(ListNode current, ListNode preview) {
        ListNode temp = current.next;
        current.next = preview;
        preview = current;
        current = temp;

        if (current != null) {
            return each(current, preview);
        }
        return null;
    }

    /**
     * @author: qianlei
     * @date: 2019-11-12 11:11
     */
    public static ListNode reverseList1(ListNode head) {
        // 当前指针前节点
        ListNode preview = null;
        // 当前节点
        ListNode current = head;

        while (current != null) {
            ListNode temp = current.next;
            current.next = preview;
            // 此处 有疑问？ current.next = preview  preview 又等于current
            // 理解：current.next = preview 赋值是给的是引用，此时current.next和preview 指向的都是null 的地址，当preview = current 时preview 指向的是current的对象地址。
            preview = current;
            // current内存地址被preview指向，现在有两个引用指向current对象的地址，current得以解脱，把current指向tem对象所指向的内存。即下一个节点
            current = temp;
        }
        return preview;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
