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

  public String lsBooks(String pref){
    String res="";
    for(int i=0;i<this.cursor;i++){
      res+=String.format(
        """
        %sbook%d:
        %s  title : %s
        %s  author: %s
        %s  price : %f

        """,
        pref, i,
        pref, books[i].title,
        pref, books[i].author,
        pref, books[i].price
      );
    }
    return res;
  }

  public void printInfo(){
    System.out.printf(
            """
            ====================
            name   : %s
            group  : %d
            avGrade: %f
            books:

            %s
            """,
            this.name,
            this.groupNumber,
            this.averageGrade,
            this.lsBooks("  ")
    );
  }

}
