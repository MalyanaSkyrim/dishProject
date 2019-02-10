public class SatelliteParser {

    static Satellite parse(String dataSatellite){
        String [] satelliteData = dataSatellite.split(",");
        char nameSatellite = satelliteData[1].trim().charAt(0);
        return Satellite.from(nameSatellite);
    }

}
