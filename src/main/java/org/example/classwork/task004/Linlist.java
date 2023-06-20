package org.example.classwork.task004;

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
    // [2, ind ,..] -> [3, ..] -> *** [4, null]
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

    // метод проверки наличия значения в списке
    public boolean contains(int value_isc){
        Node node = head;
        int index = 0;
        while(node != null){
            if (node.value == value_isc){
                System.out.println("Элемент найден и его индекс = "+ index);
                return true;
            }
            node = node.next; // [2, ..] -> [3, ..] -> [4, null]
            System.out.println(node.next);
            index++;
        }
        return false;
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
        // private int index;
        private Node next;
    }
}
