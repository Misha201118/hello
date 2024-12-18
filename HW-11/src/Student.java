public class Student {
  String name;
  int groupNumber;
  double averageGrade;

  Book[] books;
  int cursor;

  public Student(String sname, int sgoup, double avGr, int inventorySize){
    name = sname;
    groupNumber = sgoup;
    averageGrade = avGr;
    books = new Book[inventorySize];
    cursor=0;
  }

  public void addBook(Book b){
    if(cursor < books.length && cursor >= 0){
      books[cursor]=b;
      cursor++;
    }
  }

  public void updateGrade(double avGr){
    averageGrade=avGr;
  }

  public void printInfo(){
    System.out.printf(
            """
            ====================
            name   : %s
            group  : %d
            avGrade: %f
            books  :\n%s 
            """,
            this.name,
            this.groupNumber,
            this.averageGrade,
    );
  }

}