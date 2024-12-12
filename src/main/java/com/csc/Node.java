package com.csc;

public class Node<T extends Comparable<T>> {
    T data;

    Node<T> left;
    Node<T> right;

    public Node(T data) {
        this.data = data;
        left = null;
        right = null;
    }

    //method to set the left child
    public void set_left(Node<T> node) {
        left = node;
    } 

    //method to set the right child
    public void set_right(Node<T> node) {
        right = node;
    }

    //method to return the left node
    public Node<T> getLeft() {
        return left;
    }

    //method to return the right node
    public Node<T> getRight() {
        return right;
    }

    //getter for Squirrel data
    public T getData() {
        return data;
    }
}
