public class Main {

    public static void main(String[] args) {

        Car car = new Car("car1",4);
        Car car2 = new Car("car2",4);
        Truck truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);
        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);
        Car[] cars = {car, car2};
        Truck[] trucks = {truck, truck2};
        Bicycle[] bicycles = {bicycle, bicycle2};

        Vehicle[] vehicles = new Vehicle[cars.length + trucks.length + bicycles.length];
        for (int i = 0; i < cars.length; i++) {
            vehicles[i] = cars[i];
        }
        for (int i = 0; i < trucks.length; i++) {
            vehicles[i + cars.length] = trucks[i];
        }
        for (int i = 0; i < bicycles.length; i++) {
            vehicles[i + cars.length + trucks.length] = bicycles[i];
        }

        ServiceStationAllVehicles serviceStationAllVehicles = new ServiceStationAllVehicles();
        serviceStationAllVehicles.check(cars);
        serviceStationAllVehicles.check(trucks);
        serviceStationAllVehicles.check(bicycles);



    }



    }



