package ru.kudaiberdieva.homeworks.homework17;

public class MyQueue <T> {
    private MyLinkedList <T> linkedList;

    public MyQueue() {
        this.linkedList = new MyLinkedList<>();
    }
    public void offer(T data) {
        linkedList.addLast(data);
    }
    public T poll() {
        if (linkedList.getSize() == 0) {
            return null;
        }
        return (T) linkedList.remove(0);
    }
    public int size() {
        return linkedList.getSize();
    }
}
