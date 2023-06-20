package org.example.homework.task002;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДВУСВЯЗНЫЙ СПИСОК:");
        DoubleLinkedList list = new DoubleLinkedList();
        System.out.println("Добавление в начало списка:");
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.print();
        System.out.println("Удаление из начала списка:");
        list.delFirst();
        list.print();
        System.out.println("Добавление в конец списка:");
        list.addLast(13);
        list.addLast(22);
        list.print();
        System.out.println("Удаление из конца списка:");
        list.delLast();
        list.print();
        System.out.println("Разворот двусвязного списка:");
        list.revert();
        list.print();
        System.out.println("Проверка на наличие значения в списке:");
        System.out.println("Содержится ли число 3 в списке: " + list.contains(15));
        System.out.println("Содержится ли число 77 в списке: " + list.contains(99));
        System.out.println("Очистка списка:");
        list.clearList();
        list.print();
        System.out.println("Проверка исключений:");
        System.out.println("Удаление:");
        list.delLast();
        list.delFirst();
        System.out.println("Разворот:");
        list.revert();
    }
}
