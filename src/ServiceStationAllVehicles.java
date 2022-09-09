public class ServiceStationAllVehicles implements ServiceStation {

    @Override
    public void check(Car[] cars) {
        System.out.println("По всем транспортным средствам: ");
        checkVehicles(cars);
        System.out.println("Проверяем двигатель");
        System.out.println();
    }

    @Override
    public void check(Truck[] trucks) {
        System.out.println("По всем транспортным средствам: ");
        checkVehicles(trucks);
        System.out.println("Проверяем двигатель");
            System.out.println("Проверяем прицеп");
            System.out.println();
        }

    @Override
    public void check(Bicycle[] bicycles) {
        System.out.println("По всем транспортным средствам: ");
        checkVehicles(bicycles);
            System.out.println();
        }


    private void checkVehicles(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Обслуживаем " + vehicles[i].getModelName() + ", меняем покрышек: " + vehicles[i].getWheelsCount());
        }

    }

}
