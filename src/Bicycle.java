public class Bicycle extends Vehicle {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
        }


    @Override
    public void transportService() {
        checkTyres();
    }

    public void checkTyres () {
        System.out.println("По велосипедам: Обслуживаем " + getModelName() + ", меняем покрышек: " + getWheelsCount());
    }



}


