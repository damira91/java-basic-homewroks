package ru.kudaiberdieva.homeworks.homework17;

public class MainLinkedList {
    public static void main(String[] args) throws IllegalAccessException {

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.addFirst(15);
        linkedList.addFirst(7);
        linkedList.addLast(16);
        linkedList.addLast(5);

        linkedList.print();
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.add(1, 45);
        linkedList.print();
        linkedList.remove(3);
        linkedList.print();
        System.out.println(linkedList.getSize());

        MyQueue<Integer> queue = new MyQueue<>();
        queue.offer(23);
        queue.offer(24);
        queue.offer(25);
        System.out.println(queue.size());

        System.out.println(queue.poll());
        System.out.println(queue.size());


        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(12);
        stack.push(23);

        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.size());

        int[] unsortedArray = {66, 24, 55, 12, 82, 11, 90};

        BubbleSort.printArray(unsortedArray);
        System.out.println();

        int[] sortedArray = BubbleSort.sort(unsortedArray);

        BubbleSort.printArray(sortedArray);


        int[] unsortedArray2 = {78, 24, 55, 32, 8, 41, 9};
        BubbleSort.printArray(unsortedArray2);

        int[] sortedArray2 = MergeSort.sort(unsortedArray);

        BubbleSort.printArray(sortedArray2);
    }
}