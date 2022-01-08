
package SCA_Leactures.Area_And_Circle;

class Circle {
 private int radius;
    public void setRadius(int radius){
        radius=radius;
    }
    public void calculateArea(){
        double area = Math.PI*Math.pow(radius,2);
        System.out.println("Area is : "+area);
    }
    public void calculateCircumference(){
        double circle;
        circle = 2* Math.PI*radius;
        System.out.println("Circumference is : "+circle);
    }    
}
