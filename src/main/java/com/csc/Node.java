package com.csc;

public class Node {
    Squirrel data;

    Node left;
    Node right;

    public Node(Squirrel data) {
        this.data = data;
        left = null;
        right = null;
    }

    //method to set the left child
    public void set_left(Node node) {
        left = node;
    } 

    //method to set the right child
    public void set_right(Node node) {
        right = node;
    }

    //method to return the left node
    public Node getLeft() {
        return left;
    }

    //method to return the right node
    public Node getRight() {
        return right;
    }

    //getter for Squirrel data
    public Squirrel getData() {
        return data;
    }
}
