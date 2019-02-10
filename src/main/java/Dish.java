public class Dish {
    private double angle;
    private char direction;

    public Dish(double angle, char direction) {
        this.angle = angle;
        this.direction = direction;
    }

    public double getAngle() {
        return angle;
    }

    public char getDirection() {
        return direction;
    }

    public void setNewOrientation(double angle,char direction){
        if(this.direction!= direction){
            double angleDiffernce = this.angle - angle;
            if(angleDiffernce<0) this.direction  = direction;
           this.angle = Math.abs(angleDiffernce);
        }else{
            this.angle += angle;
        }
    }
}
