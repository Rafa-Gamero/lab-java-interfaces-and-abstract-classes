public interface IntList {
    /**
     * Agrega un nuevo número a la lista
     * @param number el número a agregar
     */
    void add(int number);

    /**
     * Recupera un elemento por su índice
     * @param id el índice del elemento
     * @return el número en la posición especificada
     * @throws IndexOutOfBoundsException si el índice está fuera de rango
     */
    int get(int id);
}
