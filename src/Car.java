public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
        }


    @Override
    public void transportService(Vehicle[] cars) {
        System.out.println("По легковым авто: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Обслуживаем " + cars[i].getModelName() + ", меняем покрышек: " + cars[i].getWheelsCount());
        }
        System.out.println("Проверяем двигатель");
        System.out.println();
    }



}



