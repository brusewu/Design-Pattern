package com.net.compostie;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class TreeNode {

    private String name;
    private TreeNode parent;
    private Vector<TreeNode>children = new Vector<TreeNode>();

    public TreeNode(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public TreeNode getParent(){
        return parent;
    }
    public void setParent(TreeNode parent){
        this.parent = parent;
    }

    //add the children node
    public void add(TreeNode node){
        children.add(node);
    }
    //delete children node
    public void remove(TreeNode node){
        children.remove(node);
    }
    //get the children node
    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }
}
