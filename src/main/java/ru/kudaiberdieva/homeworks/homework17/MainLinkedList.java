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
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.getSize());
        System.out.println("_______________________");
        MyQueue<Integer> queue = new MyQueue<>();
        for (int i =1; i < 10; i++) {
            System.out.println(i);
            queue.offer(i);
        }
        System.out.println();
        while(queue.size() != 0){
            System.out.println(queue.poll());
        }
        System.out.println("________________________");

        MyStack<Integer> stack = new MyStack<>();
        for (int i = 1; i <10 ; i++) {
            System.out.println(i);
            stack.push(i);
        }
        System.out.println();
        while(stack.size() != 0){
        System.out.println(stack.pop());
        }

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