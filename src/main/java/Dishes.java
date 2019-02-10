import java.util.HashMap;

public class Dishes {

    HashMap<Integer,Dish> dishes = new HashMap<>();

    public Dishes(String ... dishes) {
          for(String currentDish : dishes){
              this.dishes.put(DishParser.parseId(currentDish),DishParser.parse(currentDish));
          }
    }

    public String signal(String orientation) {


        int signal=  SignalCalculator.calculBestSignal(dishes.values(),orientation);
        return SignalDisplayer.display(signal);
    }

    public void move(String id, String orientation) {
        int indexDish = DishParser.parseId(id);
        Dish dish = dishes.get(indexDish);

        dish.setNewOrientation(OrientationParser.parseAngle(orientation),OrientationParser.parseDirection(orientation));
        dishes.replace(indexDish,dish);
    }
}
