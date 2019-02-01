class Car {
    int gear;
    int speed; 
    int seatCapacity;
    String fuel;
    
    void accelaration() {
        gear++;
        speed++;
    }
    void passengerCapacity() {
        seatCapacity = 2;
    }

    void fuelType() {
        fuel = "jet fuel";
    }
}