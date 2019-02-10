public class DishParser {

    static Dish parse(String dataDish){
        String dishData[] = dataDish.split(",");
        int indexOfLastCharachter = dishData[1].length()-1;

        try {
            double angle = Double.parseDouble(dishData[1].substring(0, indexOfLastCharachter));
            char direction = dishData[1].charAt(indexOfLastCharachter);

            return new Dish(angle,direction);
        }catch (Exception e){
            throw new IllegalArgumentException();
        }

    }


    static int parseId(String dataDish){
        String dishData[] = dataDish.split(",");
        try{
            int idOfDish = Integer.parseInt(dishData[0]);
            return idOfDish;
        }catch(Exception e){
            throw new IllegalArgumentException();
        }
    }


}
