package com.lxg;

import com.lxg.Common.TreeNode;

import java.util.Stack;

/**
 * Created by lxg on 2016/8/29.
 *
 */
public class MaximumDepthOfBinaryTree {
    /**
     * recursive solution
     */
    public int maxDepthSimple(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(maxDepthSimple(root.left), maxDepthSimple(root.right));
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }

        int depth = 1;
        int maxDepth = depth;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode cur = null;
        TreeNode child = null;
        while (!stack.empty()){
            cur = stack.peek();
            if(child != null && cur.right == child){
                depth --;
                child = stack.pop();
                continue;
            }
            if(cur.left != null && cur.left != child){
                stack.push(cur.left);
                depth ++;
                if(depth > maxDepth){
                    maxDepth = depth;
                }
                continue;
            }
            if(cur.right != null){
                stack.push(cur.right);
                depth ++;
                if(depth > maxDepth){
                    maxDepth = depth;
                }
                continue;
            }
            depth --;
            child = stack.pop();
        }
        return maxDepth;
    }
}