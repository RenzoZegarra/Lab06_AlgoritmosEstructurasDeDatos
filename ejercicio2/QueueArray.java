package ejercicio2;

import actividad2.ExceptionIsEmpty;
import actividad2.Queue;

public class QueueArray<E> implements Queue<E> {
    private E[] data;
    private int front, rear, size, capacity;

    @SuppressWarnings("unchecked")
    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.data = (E[]) new Object[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    @Override
    public void enqueue(E x) {
        if (size == capacity) {
            System.out.println("Cola llena. No se puede insertar.");
            return;
        }
        data[rear] = x;
        rear = (rear + 1) % capacity;
        size++;
    }

    @Override
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía.");
        }
        E result = data[front];
        data[front] = null;
        front = (front + 1) % capacity;
        size--;
        return result;
    }

    @Override
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía.");
        }
        return data[front];
    }

    @Override
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía.");
        }
        int index = (rear - 1 + capacity) % capacity;
        return data[index];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
