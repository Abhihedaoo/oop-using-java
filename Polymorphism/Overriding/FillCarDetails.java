class FillCarDetails extends Car {

    FillCarDetails(int gear = 23, int speed, int seatCapacity, String fuel) {
        
        super(gear, speed, seatCapacity, fuel);
        super.gear = gear;

    }
}
