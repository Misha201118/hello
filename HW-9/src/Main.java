public class Main {

  public static void main(String[] args){
    
    String test1="eye";
    String test2="fish";
    String test3="arra";
    String test4="ababahalamaha";
    String test5="";
    String test6="      ";
    String test7="darkXwolf17";
    String test8="go 2 france 4 what?";
    String test9="listen";
    String test10="silent";
    String test11="hello";
    String test12="world";
    String test13="abcdef";
    String test14="zbcdf";
    String test15="yellow";


    System.out.printf("%s: %b\n", test1, polind(test1));
    System.out.printf("%s: %b\n", test2, polind(test2));
    System.out.printf("%s: %b\n", test3, polind(test3));
    System.out.println("====================");

    System.out.printf("%s: %d\n", test1, count(test1));
    System.out.printf("%s: %d\n", test2, count(test2));
    System.out.printf("%s: %d\n", test3, count(test3));
    System.out.println("====================");

    System.out.printf("%s: %s\n", test2, reverse(test2));
    System.out.printf("%s: %s\n", test4, reverse(test4));
    System.out.println("====================");

    System.out.printf("%s: %b\n", test2, isEmpty(test2));
    System.out.printf("%s: %b\n", test5, isEmpty(test5));
    System.out.printf("%s: %b\n", test6, isEmpty(test6));
    System.out.println("====================");

    System.out.printf("%s: %d\n", test4, countLetters(test4));
    System.out.printf("%s: %d\n", test7, countLetters(test7));
    System.out.printf("%s: %d\n", test8, countLetters(test8));
    System.out.println("====================");

    int times=3;

    System.out.printf("%s, %d: %s\n", test1, times, repeat(test1, times));
    System.out.println("====================");

    char start='d';
    char end='7';

    System.out.printf("%s, %c, %c: %b\n", test7, start, end, stend(test7, start, end));
    System.out.printf("%s, %c, %c: %b\n", test4, start, end, stend(test4, start, end));
    System.out.println("====================");

    System.out.printf("%s: %s\n", test8, delSp(test8));
    System.out.println("====================");

    System.out.printf("%s: %s\n", test1, doubLet(test1));
    System.out.println("====================");

    System.out.printf("%s: %s\n", test7, rmNum(test7));
    System.out.println("====================");

    System.out.printf("%s, %s: %b\n", test9, test10, anag(test9, test10));
    System.out.printf("%s, %s: %b\n", test11, test12, anag(test11, test12));
    System.out.println("====================");

    System.out.printf("%s: %s\n", test2, compr(test2));
    System.out.printf("%s: %s\n", test2, compr(test3));
    System.out.println("====================");

    System.out.printf("%s, %s: %s\n", test13, test14, subStr(test13, test14));
    System.out.printf("%s, %s: %s\n", test11, test15, subStr(test11, test15));
    System.out.println("====================");
  }

  public static boolean polind(String arg){
    boolean pal=true;
    for(int i=0; i<arg.length()/2 + arg.length()%2;i++){

      if(arg.charAt(i) != arg.charAt(arg.length()-i-1)){
        pal=false;
        break;
      } 

    }

    return pal;
  }

  public static boolean inArr(String[] arr, String val){
    boolean in=false;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==val){
        in=true;
        break;
      }
    }

    return in;
  }

  public static boolean inArr(char[] arr, char val){
    boolean in=false;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==val){
        in=true;
        break;
      }
    }

    return in;
  }

  public static boolean inArr(int[] arr, int val){
    boolean in=false;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==val){
        in=true;
        break;
      }
    }

    return in;
  }

  public static int count(String arg){
    int c=0;
    char[] wanted={'a','e','i','o','y','u'};
    for(int i=0; i<arg.length();i++){
      if(inArr(wanted, arg.charAt(i)))
        c++;// ~~C++ reference)~~
    }
    return c;
  }

  public static String reverse(String arg){
    char[] charg=arg.toCharArray();
    char buff;

    for(int i=0;i<charg.length/2;i++){
      buff=charg[i];
      charg[i]=charg[charg.length-i-1];
      charg[charg.length-i-1]=buff;
    }

    return new String(charg);
  }

  public static boolean isEmpty(String arg){
    return arg.matches("^ *$");
  }

  public static int countLetters(String arg){
    int c=0;
    for(int i=0;i<arg.length();i++){
      if(arg.matches("^.{"+i+"}[a-zA-Z].*$"))
        c++;
    }
    return c;
  }

  public static String repeat(String arg, int times){
    String res="";
    for(int i=0;i<times;i++){
      res+=arg;
    }
    return res;
  }

  public static boolean stend(String arg, char start, char end){
    return arg.matches("^"+start+".*"+end+"$");
  }

  public static String delSp(String arg){
    return arg.replaceAll(" ", "");
  }

  public static String doubLet(String arg){
    String res="";
    for(int i=0;i<arg.length();i++){
      res=res+arg.charAt(i)+arg.charAt(i);
    }
    return res;
  }

  public static String rmNum(String arg){
    return arg.replaceAll("[0-9]","*");
  }

  public static boolean anag(String a, String b){
    a=a.toLowerCase();
    b=b.toLowerCase();

    String ar=a;
    String br=b;

    for(int i=0;i<a.length();i++){
      br=br.replaceFirst(""+a.charAt(i),"");
    }

    for(int i=0;i<b.length();i++){
      ar=ar.replaceFirst(""+b.charAt(i),"");
    }

    return ar.isEmpty() && br.isEmpty();
  }

  public static String compr(String arg){
    String res="";
    boolean comprMode=false;

    for(int i=0;i<arg.length()-1;i++){
      if(arg.charAt(i)==arg.charAt(i+1)){
        comprMode=true;
        break;
      }
    }

    if(comprMode){
      char cur;
      int c;

      for(int i=0;i<arg.length();i++){
        cur=arg.charAt(i);
        c=1;

        while(i+c<arg.length() && arg.charAt(i+c)==cur){
          c++;
        }
        i+=c-1;
        
        res=res+cur+c;
      }

    } else{
      res=arg;
    }

    return res;

  }

  public static boolean subInStr(String wanted, String where){
    boolean found=false;
    int walen=wanted.length();
    int whlen=where.length();

    if(walen<=whlen){
      for(int i=0;i<=whlen-walen;i++){
        if(where.substring(i, i+walen).equals(wanted)){
          found=true;
          break;
        }
      }
    }
    return found;
  }

  public static String subStr(String a, String b){
    String res="";
    int c;
    String buff;

    for(int i=0;i<a.length();i++){
      c=0;
      while(i+c<a.length() && subInStr(a.substring(i,i+c+1), b)){
        buff=a.substring(i,i+c+1);
        if(buff.length()>res.length())
          res=buff;
        c++;
      }

    }
    return res;

  }

}
