public class A_AddTwoNumbers {
    /*
    给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
    请你将两个数相加，并以相同形式返回一个表示和的链表。
    你可以假设除了数字 0 之外，这两个数都不会以0开头。

     */
    public static void main(String[] args) {
        ListNode l1 =new ListNode(2);
        l1.next =new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2 =new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        System.out.println(addTwoNumbers(l1,l2));

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null&&l2==null) return null;
        ListNode dummy =new ListNode(0);
        ListNode head =dummy;
        int addOne=0;
        while (l1!=null||l2!=null||addOne!=0){
            int val1=l1==null?0:l1.val;
            int val2=l2==null?0:l2.val;

            int sum=val1+val2+addOne;
            head.next=new ListNode(sum%10);
            head=head.next;
            addOne=sum>>3;
            if (l1!=null)l1=l1.next;
            if (l2!=null)l2=l2.next;

        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static String print(ListNode l){
        StringBuffer sb =new StringBuffer();
        while (l!=null){
            sb.append(l.val);
            l=l.next;
        }
        return sb.toString();
    }

    /**
     * 获取
     * @return val
     */
    public int getVal() {
        return val;
    }

    /**
     * 设置
     * @param val
     */
    public void setVal(int val) {
        this.val = val;
    }

    /**
     * 获取
     * @return next
     */
    public ListNode getNext() {
        return next;
    }

    /**
     * 设置
     * @param next
     */
    public void setNext(ListNode next) {
        this.next = next;
    }

    public String toString() {
        return "ListNode{val = " + val + ", next = " + next + "}";
    }
}


