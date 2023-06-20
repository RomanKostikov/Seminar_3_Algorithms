package org.example.homework.task002;

/*
Дополнительное реализовать методы для двухсвязного списка (добавление первого/последнего,
удаление первого/последнего, вывод, метод разворота)
 */
public class DoubleLinkedList {
    private Node head;
    private Node tail;


    /**
     * Добавление в начало списка
     *
     * @param value значение для добавления
     */
    public void addFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            head.previous = node;
            node.next = head;
            head = node;
        }
    }

    /**
     * Удаление первого элемента списка
     */
    public void delFirst() {
        if (head == null) {
            System.out.println("Список пуст!");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head.next.previous = null;
            head = head.next;
        }
    }

    /**
     * Добавление в конец списка
     *
     * @param value значение для добавления
     */
    public void addLast(int value) {
        if (head == null) {
            addFirst(value);
        } else {
            Node node = new Node(value);
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    /**
     * Удаление последнего элемента из списка
     */
    public void delLast() {
        if (tail == null) {
            System.out.println("Список пуст!");
        } else if (tail.previous == null) {
            head = null;
            tail = null;
        } else {
            tail.previous.next = null;
            tail = tail.previous;
        }
    }

    /**
     * Проверка на содержание заданного значения в списке
     *
     * @param value значение для поиска
     * @return true - значение найдено, false - значение не найдено
     */
    public boolean contains(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    /**
     * Разворот двусвязанного списка
     */
    public void revert() {
        if (head == null) {
            System.out.println("Список пуст! Не могу развернуть список.");
        } else {
            Node node = head;
            head = tail;
            tail = node;
            node = head;
            while (node != null) {
                Node next = node.next;
                node.next = node.previous;
                node.previous = next;
                node = node.next;
            }
        }
    }

    public void clearList() {
        head = null;
        tail = null;
    }

    /**
     * Печать списка
     */
    public void print() {
        if (head == null) {
            System.out.println("Список пуст!");
        } else {
            Node node = head;
            while (node != tail) {
                System.out.print(node.value + " -> ");
                node = node.next;
            }
            System.out.println(tail.value);
        }
    }

    class Node {
        private int value;
        private Node previous;
        private Node next;

        private Node() {
        }

        private Node(int value) {
            this.value = value;
        }
    }
}
