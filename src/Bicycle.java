public class Bicycle extends Vehicle {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
        }


    @Override
    public void transportService(Vehicle[] bicycles) {
        System.out.println("По велосипедам: ");
        for (int i = 0; i < bicycles.length; i++) {
            System.out.println("Обслуживаем " + bicycles[i].getModelName() + ", меняем покрышек: " + bicycles[i].getWheelsCount());
        }
        System.out.println();
    }

}


