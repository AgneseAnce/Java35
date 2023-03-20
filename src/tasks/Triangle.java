package tasks;

public class Triangle{
    private double side1;
    private double side2;
    private double side3;

    // Setter methods
    public void setSide1(double side1){
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Getter methods
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Private validation method
    private boolean isValid(double side1, double side2, double side3){
//        if(side1+ side3 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
//            return true;
//        } else {
//            return false;
//        }
        return side1+ side3 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    public double areaTriangle(){
            double area = 0;
            if(isValid(side1, side2, side3)){
                 double halfPar = (side1+side2+side3)/2;
                 area = Math.sqrt(halfPar * (halfPar-side1) * (halfPar-side2) * (halfPar-side3));

       } else {
                System.out.println("This triangle is not valid");
            }
            return area;
    }
}

