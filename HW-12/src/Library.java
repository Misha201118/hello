public class Library{

  private int cursor=0;
  private Book[] inventory;

  public Library(int cap){

    this.inventory = new Book[cap];
  }

  public Library(Book[] inv){

    this.inventory = inv;
  }

  public static void addBook(Library lib, Book b){
    if(lib.cursor < lib.inventory.length){
      lib.inventory[lib.cursor] = b;
      lib.cursor++;
    }
  }

  public static void vacuum(Library lib, int start){
    if(start<0 || start>=lib.inventory.length)
      return;

    int curs = 0;
    int limiter = 0;
    int nulls[] = new int[lib.inventory.length];

    for(int i=0;i<lib.inventory.length;i++){

      if(null==lib.inventory[i]){
        nulls[limiter]=i;
        limiter++;

      } else if(curs<limiter) {
        lib.inventory[curs] = lib.inventory[i];
        lib.inventory[i]    = null;
        nulls[limiter]      = i;
        limiter++;
        curs++;
      }

    }

  }

  public static void rmBook(Library lib, int ind){
    if(ind >= 0 && ind < lib.inventory.length){
      lib.inventory[ind]=null;
      vacuum(lib, 0);
    };
  }

  public static int getIndexByName(Library lib, String name){
    for(int i=0;i<lib.inventory.length;i++){
      if(null==lib.inventory[i])
        break;
      if(name.equals(lib.inventory[i].title))
        return i;
    }
    return -1;
  }

  public static int getIndexByAuth(Library lib, String auth){
    for(int i=0;i<lib.inventory.length;i++){
      if(null==lib.inventory[i])
        break;
      if(auth.equals(lib.inventory[i].author))
        return i;
    }
    return -1;
  }

  public static int bookc(Library lib){
    return lib.cursor;
  }

}