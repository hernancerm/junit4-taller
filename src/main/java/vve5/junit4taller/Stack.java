package vve5.junit4taller;

@SuppressWarnings("unchecked")
public class Stack<T> {

    private Object[] array = new Object[5];
    private int currentIndex = 0;

    /**
     * Añade un objeto a la pila. Levanta una excepción
     * cuando el objeto proporcionado es nulo.
     *
     * @param o objeto a añadir al final de la pila.
     */
    public void push(T o) {
        if (o != null) {
            if (currentIndex < array.length - 1) {
                array[currentIndex++] = o;
            } else {
                enlargeArray();
                push(o);
            }
        } else {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    /**
     * Retira el objeto que está al final de la pila y lo retorna.
     * Cuando la pila está vacía, retorna nulo.
     *
     * @return objeto retirado de la pila.
     */
    public T pop() {
        T o = null;

        if (currentIndex > 0) {
            o = (T) array[--currentIndex];
        }

        return o;
    }

    /**
     *
     * Retorna el objeto que está al final de la pila, sin retirarlo.
     * Cuando la pila está vacía, retorna nulo.
     *
     * @return objeto al final de la pila.
     */
    public T peek() {
        T o = null;

        if (currentIndex > 0) {
            o = (T) array[currentIndex - 1];
        }

        return o;
    }

    /**
     * @return número de elementos en la pila.
     */
    public int size() {
        return currentIndex;
    }

    private void enlargeArray() {
        Object[] array = new Object[this.array.length + 5];
        System.arraycopy(this.array, 0, array, 0, this.array.length);
        this.array = array;
    }

    // *****************************
    // *** Métodos de depuración ***
    // *****************************

    public void printArray() {
        System.out.print("STACK INTERNAL: ");
        for (Object o : array) {
            System.out.print(((T) o) + " ");
        }
    }
    public T[] toArray() {
        Object[] array = new Object[size()];
        System.arraycopy(this.array, 0, array, 0, array.length);
        return (T[]) array;
    }
}
