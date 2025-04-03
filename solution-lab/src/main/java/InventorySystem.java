public class InventorySystem { public static void main(String[] args) {
    Sedan sedan = new Sedan("1HGCM82633A123456", "Honda", "Accord", 45000);
    UtilityVehicle suv = new UtilityVehicle("5TFCY5F14AX123456", "Toyota", "4Runner", 32000, true);
    Truck truck = new Truck("1FT8W3BT8BEA12345", "Ford", "F-150", 28000, 4500.5);

    System.out.println(sedan.getInfo());
    System.out.println(suv.getInfo());
    System.out.println(truck.getInfo());
}
}
