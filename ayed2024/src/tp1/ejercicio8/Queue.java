package tp1.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private List<T> elements;

    public Queue() {
        elements = new ArrayList<>();
    }

    // Inserta el elemento al final de la cola
    public void enqueue(T dato) {
        elements.add(dato);
    }

    // Elimina el elemento del frente de la cola y lo retorna
    // Si la cola está vacía, se produce un error
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return elements.remove(0);
    }

    // Retorna el elemento del frente de la cola
    // Si la cola está vacía, se produce un error
    public T head() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return elements.get(0);
    }

    // Retorna verdadero si la cola no tiene elementos y falso en caso contrario
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Retorna la cantidad de elementos de la cola
    public int size() {
        return elements.size();
    }

    // Retorna los elementos de la cola en un String
    @Override
    public String toString() {
        return elements.toString();
    }
}