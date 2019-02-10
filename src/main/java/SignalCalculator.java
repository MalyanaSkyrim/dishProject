import java.util.Collection;

public class SignalCalculator {

    static int calculBestSignal(Collection<Dish> dishes,String dataSatellite){
        Satellite satellite = SatelliteParser.parse(dataSatellite);
        int maxSignal = 0;
        for(Dish currentDish : dishes) {
            int signal = calculSignal(currentDish,satellite);
            if(maxSignal<signal) maxSignal=signal;
        }
        return maxSignal;
    }



    private static int calculSignal(Dish dish,Satellite satellite){
        if(dish.getDirection()!=satellite.getDirection())
            return 0;
        else {
            return 10 - (int)Math.round(Math.abs(dish.getAngle()-satellite.getAngle())*10);

        }
    }


}
