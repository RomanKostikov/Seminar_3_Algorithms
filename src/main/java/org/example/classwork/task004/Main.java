package org.example.classwork.task004;

public class Main {
    public static void main(String[] args) {
        Linlist list = new Linlist();
        list.addFirst(1);
        list.removeLast();
        list.addFirst(0);
        list.addLast(2);
        list.removeLast();
        list.addLast(3);
        list.addLast(2);
        list.addFirst(5);
        list.print();
        System.out.println();
        if (!list.contains(3)){
            System.out.println("Элемента с таким значением не существует");
        }
    }
}
