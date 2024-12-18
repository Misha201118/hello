public class Book {

  String title ;
  String author;
  double price ;

  public Book(String btitle, String auth, double prc){
    this.title = btitle;
    this.author= auth ;
    this.price = prc  ;
  }

  public void printInfo(){
    System.out.printf(
      """
      ====================
      title : %s
      author: %s
      price : %f
      """,
      this.title,
      this.author,
      this.price
    );
  }

  public void applyDiscount(double procent){
    this.price *= 1.0-procent;
  }



}
