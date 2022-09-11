public class ServiceStationAllVehicles {

public void check (Vehicle [] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
                vehicles[i].transportService();
                System.out.println();
        }

}


}
