public class Truck extends Vehicle {


    public Truck(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
        }

      @Override
    public void transportService(Vehicle[] trucks) {
        System.out.println("По грузовикам: ");
        for (int i = 0; i < trucks.length; i++) {
            System.out.println("Обслуживаем " + trucks[i].getModelName() + ", меняем покрышек: " + trucks[i].getWheelsCount());
        }
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
        System.out.println();
    }

}


