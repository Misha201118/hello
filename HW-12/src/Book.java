public class Book {

  private String title ;
  private String author;
  private double price ;
  private int year;

  public Book(String btitle, String auth, double prc, int y){
    this.title = btitle;
    this.author= auth  ;
    this.price = prc   ;
    this.year  = y     ;
  }

  public void printInfo(){
    System.out.printf(
      """
      ====================
      title : %s
      author: %s
      price : %f
      year  : %d
      """,
      this.title,
      this.author,
      this.price,
      this.year
    );
  }

  public void applyDiscount(double procent){
    this.price *= 1.0-procent;
  }



}
