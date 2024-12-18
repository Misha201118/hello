public class Main {

  public static void main(String[] args){
    Book b1 = new Book("why","unknown",20.0);
    Book b2 = new Book("where","anon",60.5);
    Book b3 = new Book("what","none",47.63);
    b3.applyDiscount(0.1);
    b1.printInfo();
    b2.printInfo();
    b3.printInfo();

    Circle c = new Circle(5);
    System.out.printf(
      """
      ====================
      area     : %f
      perimeter: %f
      """,
      Circle.calculateArea(c),
      Circle.calculateCircumference(c)
    );

  }

}