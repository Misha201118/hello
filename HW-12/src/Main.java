public class Main {

  public static void main(String[] args){

    Library test1 = new Library(4);
    Library.addBook(test1, new Book("CCU","gov.ua",0,2001));
    Library.addBook(test1, new Book("FCU","gov.ua",0,2002));
    Library.addBook(test1, new Book("LaPoC","gov.ua",0,2001));
    Library.addBook(test1, new Book("harry potter","Joanne Rowling",57,1997));
    Library.addBook(test1, new Book("junk","kjdhKJDlsdf./",0,1));

    System.out.println(Library.getIndexByName(test1,"CC"));
    System.out.println(Library.getIndexByName(test1,"CCU"));
    System.out.println(Library.getIndexByName(test1,"FCU"));
    System.out.println(Library.getIndexByName(test1,"LaPoC"));
    System.out.println(Library.getIndexByAuth(test1,"Joanne Rowling"));
    System.out.println(Library.getIndexByName(test1,"junk"));
    System.out.println(Library.bookc(test1));
    System.out.println("===================");

    Library.rmBook(test1, Library.getIndexByName(test1, "FCU"));
    System.out.println(Library.bookc(test1));
    System.out.println(Library.getIndexByName(test1,"CCU"));
    System.out.println(Library.getIndexByName(test1,"FCU"));
    System.out.println(Library.getIndexByName(test1,"LaPoC"));
    System.out.println(Library.getIndexByAuth(test1,"Joanne Rowling"));
    System.out.println("===================");

    Library.rmBook(test1, Library.getIndexByAuth(test1, "Joanne Rowling"));
    System.out.println(Library.bookc(test1));
    System.out.println(Library.getIndexByName(test1,"CCU"));
    System.out.println(Library.getIndexByName(test1,"FCU"));
    System.out.println(Library.getIndexByName(test1,"LaPoC"));
    System.out.println(Library.getIndexByAuth(test1,"Joanne Rowling"));

    System.out.println("========Bank Accounts========");
    Account ac1=new Account(20);
    Account ac2=new Account(20);
    Account ac3=new Account(20);
    Account ac4=new Account(20);
    Account ac5=new Account(20);
    Account ac6=new Account(20);
    Account ac7=new Account(20);
    Account ac8=new Account(20);
    Account ac9=new Account(20);

    System.out.println(ac9.getId(ac9));
    Account.trans(ac3,ac7, 5);
    Account.block(ac9,true);
    Account.trans(ac1,ac9,6);

    System.out.printf(
      """
      ac1: %f
      ac3: %f
      ac7: %f
      ac9: %f
      """,
      Account.getBal(ac1),
      Account.getBal(ac3),
      Account.getBal(ac7),
      Account.getBal(ac9)
    );

  }

}
