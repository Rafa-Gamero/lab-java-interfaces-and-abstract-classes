public class IntVector implements IntList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 20;
    private static final int GROWTH_FACTOR = 2;

    public IntVector() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            // Crear nuevo array con el doble de capacidad
            int newCapacity = array.length * GROWTH_FACTOR;
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
