package ru.kudaiberdieva.homeworks.homework17;

public class MyStack <T>{
    private MyLinkedList<T> linkedList;

    public MyStack() {
        this.linkedList = new MyLinkedList<>();
    }
    public void push(T data) {
        linkedList.addFirst(data);
    }
    public T pop() {
        if (linkedList.getSize() == 0) {
            return null;
        }
        return (T) linkedList.remove(0);
    }
    public int size() {
        return linkedList.getSize();
    }
}
