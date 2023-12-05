package ru.kudaiberdieva.homeworks.homework17;



public class MyLinkedList<T> {

    private Item<T> start;
    private Item<T> end;

    public void addFirst(T data){
        Item<T> item = new Item (data);
        if (start == null) {
            start = item;
            end = item;
        } else {
            item.next = start;
            start = item;
        }
    }

    public void addLast(T data){
        Item<T> item = new Item(data);
        if(end == null){
            start = item;
            end = item;
        } else {
            end.next = item;
            end = item;
        }
    }

    public T getFirst(){
        if(start == null){
            return null;
        }else{
        return start.data;
        }
    }
    public T getLast(){
        if(end == null){
            return null;
        } else {
            return end.data;
        }
    }
    public void add(int position, T data) throws IllegalAccessException {
        if(position < 0){
                throw new IllegalAccessException("Position cannot be negative");
        }
        Item<T> item = new Item(data);
        if (position == 0) {
            addFirst(data);
        }else{
            Item<T> current = start;
            for (int i = 0; i < position-1 && current!=null ; i++) {

                current = current.next;
            }
            if(current !=null){
                item.next = current.next;
                current.next = item;
                if(item.next == null){
                    end = item;
                }
            }else{
                throw new IllegalArgumentException("Invalid position");
            }
        }
    }

    public T remove(int position) throws IllegalAccessException {
        if(position<0) {
            throw new IllegalAccessException("Position can't be negative");
        }
        if(start==null){
            throw new IllegalStateException("List is Empty");
        }
        T removedData;
        if(position==0){
            removedData = start.data;
            start= start.next;
            if(start == null){
                end = null;
            }
        }else{
            Item<T> current = start;
            for (int i = 0; i < position-1 && current !=null; i++) {
                current=current.next;
            }
            if(current !=null && current.next !=null){
                removedData = current.next.data;
                current.next = current.next.next;
                if (current.next==null){
                    end = current;
                }
            }else{
                throw new IllegalArgumentException("Invalid position");
            }
        }
        return removedData;
    }
    public T get(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Position cannot be negative");
        }
        Item<T> current = start;
        for (int i = 0; i < position && current != null; i++) {
            current = current.next;
        }

        if (current != null) {
            return current.data;
        } else {
            throw new IllegalArgumentException("Invalid position");
        }
    }
    public int getSize(){
        Item<T> current = start;
        int size = 0;
        while(current != null){
            size++;
            current = current.next;
        }
        return size;
    }
    public void print() {
        Item<T> current = start;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public T[] toArray() {
        Object[] array = new Object[getSize()];
        int index = 0;
        Item<T> current = start;

        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }

        T[] resultArray = (T[]) Arrays.copyOf(array, getSize(), array.getClass());
        return resultArray;
    }
}
