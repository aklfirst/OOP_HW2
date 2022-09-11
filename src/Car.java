public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
        }


    @Override
    public void transportService() {
        checkTyres();
        checkEngine();
    }

    public void checkTyres() {
        System.out.println("По легковым авто: Обслуживаем " + getModelName() + ", меняем покрышек: " + getWheelsCount());
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }


}



