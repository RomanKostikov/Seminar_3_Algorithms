package org.example.homework.task001;

public class Main {
    public static void main(String[] args) {
        System.out.println("ОДНОСВЯЗНЫЙ СПИСОК:");
        SingleLinkedList list = new SingleLinkedList();
        System.out.println("Добавление в начало списка:");
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.print();
        System.out.println("Удаление из начала списка:");
        list.removeFirst();
        list.print();
        System.out.println("Добавление в конец списка:");
        list.addLast(15);
        list.addLast(16);
        list.print();
        System.out.println("Удаление из конца списка:");
        list.removeLast();
        list.print();
        System.out.println("Разворот односвязанного списка:");
        list.revert();
        list.print();
        System.out.println("Проверка на наличие значения в списке:");
        System.out.println("Содержится ли число 15 в списке: " + list.contains(15));
        System.out.println("Содержится ли число 77 в списке: " + list.contains(77));
        System.out.println("Очистка списка:");
        list.clearList();
        list.print();
        System.out.println("Проверка исключений удаления:");
        System.out.println("Удаление:");
        list.removeLast();
        list.removeFirst();
        System.out.println("Разворот:");
        list.revert();
    }
}
