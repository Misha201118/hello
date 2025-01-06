public class Account {

  private double balance;
  private int id;
  private boolean blocked=false;
  private static final int dbBlockSize=8;
  private static int lid=0;
  private static int cursor=0;
  private static Account[] db = new Account[dbBlockSize];

  public Account(double bal){
    if(this.cursor >= this.db.length){

      Account[] buff=new Account[this.dbBlockSize*(this.db.length/this.dbBlockSize+1)];

      for(int i=0;i<this.cursor;i++){
        buff[i]=this.db[i];
        this.db=buff;
      }

    }

    this.id = ++this.lid;
    this.balance=bal;

    this.db[this.cursor]=this;
    this.cursor++;
  }

  public static int getId(Account ac){
    return ac.id;
  }

  public static Account getAcById(int id){
    for(Account ac : Account.db){
      if(null!=ac && id==ac.id){
        return ac;
      }
    }
    return null;
  }

  public static boolean add2bal(Account ac, double amount){
    if(!ac.blocked) {
      ac.balance += amount;
      return true;
    }
    return false;
  }

  public static boolean add2bal(int id, double amount){
    Account ac=Account.getAcById(id);
    if(null!=ac) {
      return Account.add2bal(ac,amount);
    }
    return false;
  }

  public static boolean trans(Account src, Account dst, double amount){
    if(Account.add2bal(src,amount*-1) && Account.add2bal(dst,amount)){
      return true;
    } else {
      Account.add2bal(src,amount);
      Account.add2bal(dst,amount*-1);
    }
    return false;
  }

  public static double getBal(Account ac){
    return ac.balance;
  }

  public static void block(Account ac,boolean state){
    ac.blocked=state;
  }

}