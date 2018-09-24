package org.whuims.leetcode;

public class TreeLinkNode {

    public int val;
    public TreeLinkNode left, right, next;

    public TreeLinkNode(int val) {
        this.val = val;
    }

    public TreeLinkNode(int val, TreeLinkNode left, TreeLinkNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
