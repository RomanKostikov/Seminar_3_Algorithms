package org.example.classwork.task001_2;

/*
1.Реализуем простой односвязный список.
2.Пишем только структуру, никаких методов не требуется
 */
public class Linlist {
    private Node head;

    // [2, ..] -> [3, ..]
    // [1] -> [2]
    // 1
    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Нельзя удалить элемент из пустого списка");
        } else {
            head = head.next;
        }
    }

    // [2, ..] -> [3, ..] -> [4, ..] -> [5, null]
    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
    }


    private class Node {
        private int value;
        private Node next;
    }

}
