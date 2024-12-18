public class Circle {
  static final double PI=3.141592;
  double radius;

  public Circle(double r){
    this.radius=r;
  }

  public static double calculateArea(Circle obj){
    return PI*(Math.pow(obj.radius,2));
  }

  public static double calculateCircumference(Circle obj){
    return PI*obj.radius*2;
  }

}