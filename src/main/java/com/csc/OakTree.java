package com.csc;


public class OakTree {
  Node root;

  public OakTree(Node squirrelNode) { 
    root = squirrelNode; //assign the passed in node as the root
  }

  public OakTree() {
    root = null; //set root to null as default
  }

  public void printInOrder() {
    printInOrder(root);
  }

  //recursive in order traversal method
  private void printInOrder(Node node) {
    if (node != null) {
      printInOrder(node.getLeft());
      System.out.println(node.data.getName());
      printInOrder(node.getRight());
    } 
  }

  public void insertNode(Node newNode) {
    root = insertNode(root, newNode);
  }

  private Node insertNode(Node current, Node newNode) {
    if (current == null) {
      return newNode;
    }
    //compare Squirrel names lexicographically
    if (newNode.data.getName().compareTo(current.data.getName()) < 0) { //if new node value is less than current node value
      current.set_left(insertNode(current.getLeft(), newNode));      //go to left subtree
    } else {
      current.set_right(insertNode(current.getRight(), newNode)); //go to right subtree
    }
    return current;
  }

  public static void main(String[] args) {
    Squirrel cheeks = new Squirrel("Cheeks");
    Node nodeOne = new Node(cheeks);
    
    OakTree tree = new OakTree(nodeOne); //initialize new binary tree with nodeOne as the root

    Squirrel squeaks = new Squirrel("Squeaks");
    Node nodeTwo = new Node(squeaks);

    Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
    Node nodeThree = new Node(fluffybutt);

    Squirrel alvin = new Squirrel("Alvin the Chipmunk");
    Node nodeFour = new Node(alvin);

    Squirrel simon = new Squirrel("Simon the Chipmunk");
    Node nodeFive = new Node(simon);

    nodeOne.set_left(nodeTwo);  //set left child as node two
    nodeOne.set_right(nodeThree);  //set right child as node three

    System.out.println("In order traversal: ");
    tree.printInOrder();  //display in order traversal of the binary tree

    Node retrievedLeft = nodeOne.getLeft(); // This should retrieve the left node
    Node retrievedRight = nodeOne.getRight(); // This should retrieve the right node

    //display the retrieved nodes
    System.out.println("Retrieved Left: " + retrievedLeft.getData().getName());   
    System.out.println("Retrieved Right: " + retrievedRight.getData().getName());

    //test insert method
    tree.insertNode(nodeFour);
    tree.insertNode(nodeFive);
    System.out.println("In order traversal: ");
    tree.printInOrder();
  }
}
