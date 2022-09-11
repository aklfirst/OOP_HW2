public class Truck extends Vehicle {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void transportService() {
        checkTyres();
        checkEngine();
        checkTrailer();
    }

    public void checkTyres() {
        System.out.println("По легковым авто: Обслуживаем " + getModelName() + ", меняем покрышек: " + getWheelsCount());
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }


}


