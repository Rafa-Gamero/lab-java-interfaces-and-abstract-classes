public abstract class Car {
    protected String vinNumber;
    protected String make;
    protected String model;
    protected int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    /**
     * Obtiene información del vehículo
     * @return String con los detalles del vehículo
     */
    public String getInfo() {
        return String.format("VIN: %s | Marca: %s | Modelo: %s | Kilometraje: %,d km",
                vinNumber, make, model, mileage);
    }
}
