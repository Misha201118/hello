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

    Student st1 = new Student("john", 2, 4.5, 3);
    Student st2 = new Student("marry", 1, 7, 3);
    Student st3 = new Student("michael", 0, 2.5, 3);

    st1.addBook(b1);
    st2.addBook(b3);
    st2.addBook(b2);
    st2.addBook(b1);
    st3.addBook(b2);
    st3.addBook(b3);

    st3.updateGrade(4.5);

    st1.printInfo();
    st2.printInfo();
    st3.printInfo();

  }

}
