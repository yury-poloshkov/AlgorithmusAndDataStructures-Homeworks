package org.example;

public class Main {
    public static void main(String[] args) {
        OnewayLinkedList testList = new OnewayLinkedList();
        int listSize = 10;
        int minValue = 1;
        int maxValue = minValue + 100;
        for (int i = 0; i <listSize; i++){
            testList.addFirst((int) (minValue+Math.random()*(maxValue-minValue)));
        }
        testList.printOnewayLinkedList("OriginalList");
        testList.reverseOnewayLinkedList(testList.head, testList.head);
        testList.printOnewayLinkedList("ReversedList");

        int nFromEnd = (int) (Math.random()*listSize);
        System.out.println(nFromEnd + "-nd number from end : " + testList.findNodeFromEnd(nFromEnd));

    }
}