public class IntArrayList implements IntList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private static final double GROWTH_FACTOR = 1.5;

    public IntArrayList() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            // Crear nuevo array 50% más grande
            int newCapacity = (int)(array.length * GROWTH_FACTOR);
            int[] newArray = new int[newCapacity];
            // Copiar elementos al nuevo array
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + id);
        }
        return array[id];
    }
}
