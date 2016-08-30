package com.lxg;

import com.lxg.Common.TreeNode;

/**
 * Created by lxg on 2016/8/29.
 *
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

}
