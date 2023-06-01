package org.example;

public class OnewayLinkedList {
    public Node head;
    class Node {
        private int value;
        private Node nextNode;
    }
    public void addFirst(int value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.nextNode = head;
        }
        head = node;
    }
    public void printOnewayLinkedList(String listType){
        if (head != null){
            Node node = new Node();
            node = head;
            System.out.print(listType + ": " + node.value + "; ");
            while (node.nextNode != null) {
                node = node.nextNode;
                System.out.print(node.value + "; ");
            }
            System.out.println("");
        }
    }
    public Node reverseOnewayLinkedList(Node node, Node previousNode){
        if (node == null){
            return null;
        }

        if (node == head){
            reverseOnewayLinkedList(node.nextNode, node);
            node.nextNode = null;
        }
        else{
            if (node.nextNode == null) {
                head = node;
            }
            else {
                reverseOnewayLinkedList(node.nextNode, node);
            }
            node.nextNode = previousNode;
        }
        return previousNode;
    }
    public int findNodeFromEnd(int nFromEnd) {
        Node fastNode = new Node();
        Node slowNode = new Node();
        fastNode = head;
        slowNode = head;

        for (int i = 0; i < nFromEnd - 1; i++){
            if (fastNode.nextNode != null) {
                fastNode = fastNode.nextNode;
            }
            else {
                return -1;
            }
        }
        while (fastNode.nextNode != null){
            fastNode = fastNode.nextNode;
            slowNode = slowNode.nextNode;
        }
        return slowNode.value;
    }

}
