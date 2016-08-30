package com.lxg;

import com.lxg.Common.ListNode;

/**
 * Created by lxg on 2016/8/30.
 *
 */
public class LinkedListRandomNode {
    private int length = 0;
    private ListNode head;

    private int getRandom(int max){
        return (int)(Math.random()*max);
    }

    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public LinkedListRandomNode(ListNode head) {
        this.head = head;
        ListNode cur = head;
        while (cur != null){
            cur = cur.next;
            length ++;
        }
    }

    /** Returns a random node's value. */
    public int getRandom() {
        ListNode cur = head;
        int rd = getRandom(length);
        for (int i=0; i<rd; i++){
            cur = cur.next;
        }
        return cur.val;
    }
}
