public enum Satellite {

    ASTRA('A',19.2,'E'),
    HOTBIRD ('H',13.0,'E'),
    NILESAT ('N',7.0,'W');


    private char name;
    private double angle;
    private char direction;




    Satellite(char name,double angle,char direction){
        this.name = name;
        this.angle = angle;
        this.direction = direction;
    }


    public static Satellite from (char name){
        switch (name){
            case 'A' : return  ASTRA;
            case  'H' : return HOTBIRD;
            case 'N' : return NILESAT;
            default: throw new IllegalArgumentException();
        }
    }


    public double getAngle() {
        return angle;
    }

    public char getDirection() {
        return direction;
    }
}
