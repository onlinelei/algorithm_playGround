package win.suroot.leetCode.lc0002_AddTwoNumber;

import win.suroot.leetCode.ListNode;

/**
 * @author qianlei
 * @create 2019-11-12 11:06
 * @desc 两数相加
 */
public class AddTwoNumber {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode head = new ListNode(0);
        while (temp1 != null || temp2 != null) {
            head = recursive(head, (temp1 != null ? temp1.val : 0) + (temp2 != null ? temp2.val : 0));
            temp1 = temp1 != null ? temp1.next : null;
            temp2 = temp2 != null ? temp2.next : null;
        }
        if (head.val == 0) {
            head = head.next;
        }

        // 翻转连表
        return recursive(head, null);
    }

    private ListNode recursive(ListNode next, int count) {
        ListNode headTemp = new ListNode(0);
        if (count + next.val >= 10) {
            next.val = (next.val + count) - 10;
            headTemp.val = headTemp.val + 1;
        } else {
            next.val = count + next.val;
        }
        headTemp.next = next;
        return headTemp;
    }

    private ListNode recursive(ListNode head, ListNode preview) {
        if (head == null) {
            return preview;
        }
        ListNode temp = head.next;
        head.next = preview;
        preview = head;
        head = temp;

        return recursive(head, preview);
    }


    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}
