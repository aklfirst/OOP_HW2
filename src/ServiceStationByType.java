public class ServiceStationByType implements ServiceStation {

    @Override
    public void check(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Обслуживаем " + cars[i].getModelName() + ", меняем покрышек: " + cars[i].getWheelsCount());
            System.out.println("Проверяем двигатель");
            System.out.println();
        }
    }
    @Override
    public void check(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++) {
            System.out.println("Обслуживаем " + trucks[i].getModelName() + ", меняем покрышек: " + trucks[i].getWheelsCount());
            System.out.println("Проверяем двигатель");
            System.out.println("Проверяем прицеп");
            System.out.println();
        }
    }
    @Override
    public void check(Bicycle[] bicycles) {
        for (int i = 0; i < bicycles.length; i++) {
            System.out.println("Обслуживаем " + bicycles[i].getModelName() + ", меняем покрышек: " + bicycles[i].getWheelsCount());
            System.out.println();
        }

    }


}



