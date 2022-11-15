package bai10.baitap1;

public class MyList1<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList1() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList1(Object[] elements) {
        this.elements = elements;
    }

    public void add(int index, E element) {
        Object[] element1 = new Object[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            if (index < size) {
                element1[i] = elements[i];
            } else {
                element1[i + 1] = element;
            }
        }
        elements = element1;
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            System.out.println("vuot qua size");
        }
        return (E) elements[index];
    }

    public Object clone() {
        return elements;
    }

    public int size() {
        return elements.length;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public E get(int index){
        if (index < 0 || index > size) {
            System.out.println("vuot qua size");
        }
        return  (E) elements[index];
    }


    public void clear(){
        elements = new Object[0];
    }
}
