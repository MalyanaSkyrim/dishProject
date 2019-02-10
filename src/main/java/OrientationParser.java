public class OrientationParser {


    static char parseDirection(String orientation){
        int indexOfLastCharachter = orientation.length()-1;
        try {
          return orientation.charAt(indexOfLastCharachter);
        }catch (Exception e){
            throw new IllegalArgumentException();
        }
    }

    static double parseAngle(String orientation){
        int indexOfLastCharachter = orientation.length()-1;
        try {
            return Double.parseDouble(orientation.substring(0,indexOfLastCharachter));
        }catch (Exception e){
            throw new IllegalArgumentException();
        }
    }

}
