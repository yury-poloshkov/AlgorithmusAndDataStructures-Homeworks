package org.example;
/**
 * Реализовать полноценное левостороннее красно-черное дерево.
 * И реализовать в нем метод добавления новых элементов с балансировкой.
 */
public class Main {
    public static void main(String[] args) {
        final LhRBTree testTree = new LhRBTree();
        int twoDigitsNumbers = 90;
        int[] treeData = new int[twoDigitsNumbers];
        for (int i = 0; i < twoDigitsNumbers; i ++) {
            treeData[i] = i + 10;
        }
        int treeSize = 31;
        for (int i = 0; i < treeSize; i++) {
            int rndIndex = (int) (Math.random() * (twoDigitsNumbers - i));
            System.out.print(treeData[rndIndex] + "  ");
            testTree.add(treeData[rndIndex]);
            treeData[rndIndex] = treeData[twoDigitsNumbers - i - 1];
        }
        System.out.println("COMPILATION FINISHED");

        testTree.printTree();

    }
}