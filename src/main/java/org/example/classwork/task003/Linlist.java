package org.example.classwork.task003;

public class Linlist {
    private Node head;
    // [2, ..] -> [3, ..]
    // [1] -> [2]
    // 1
    public void addFirst(int value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.next = head;
        }
        head = node;
    }

    public void removeFirst(){
        if (head == null){
            System.out.println("Нельзя удалить элемент из пустого списка");
        }
        else{
            head = head.next;
        }
    }

    // [2, ..] -> [3, ..] -> [4, ..] -> [5, null]
    public void addLast(int value){
        Node node = new Node();
        node.value = value;
        if (head == null){
            head = node;
        }
        else{
            Node last = head;
            while (last.next != null){
                last = last.next;
            }
            last.next = node;
        }
    }
    // [2, ..] -> [3, ..] -> *** [4, null]
    // [2, null]
    public void removeLast(){
        if (head == null){
            System.out.println("Нельзя удалить элемент из пустого списка");
        }
        else{
            Node node = head;
            while(node.next != null){
                if (node.next.next == null){
                    node.next = null;
                    return;
                }
                node = node.next;
            }
            head = null;
        }
    }

    public void print(){
        if (head == null){
            System.out.println("Список пуст");
            return;
        }
        Node node = head;
        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
    }


    private class Node{
        private int value;
        private Node next;
    }
}
