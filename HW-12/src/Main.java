public class Main {

  public static void main(String[] args){

    Library test1 = new Library(5);
    Library.addBook(test1, new Book("CCU","gov.ua",0,1991));
    System.out.println(Library.getIndexByName(test1,"CCU"));
    System.out.println(Library.getIndexByName(test1,"CC"));
  }

}
