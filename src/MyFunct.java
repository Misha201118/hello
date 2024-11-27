public class MyFunct {
  public static void main(String[] args){

  }

  //function to print array
  public static void array2str(int[] arr){
    String res="[";
    for(int i=0;i<arr.length;i++){
      res+=String.format((i==0)?"%d":", %d", arr[i]);
    }
    res+="]";

    System.out.println(res);
  }

  public static void array2str(int[][] arr, boolean matr){
    char del=(matr)?'\n':' ';
    String res=(matr)?"[\n":"[";
    for(int i=0;i<arr.length;i++){
      res+=String.format((i==0)?"[":",%s[",del);
      
      for(int j=0;j<arr[i].length;j++){
        res+=String.format((j==0)?"%d":", %d", arr[i][j]);
      }
      
      res+="]";

    }
    res+=(matr)?"\n]":"]";

    System.out.println(res);
  }

  public static void array2str(int[][] arr){
    array2str(arr, false);
  }

  public static void array2str(String[][] arr, boolean matr){
    char del=(matr)?'\n':' ';
    String res=(matr)?"[\n":"[";
    for(int i=0;i<arr.length;i++){
      res+=String.format((i==0)?"[":",%s[",del);
      
      for(int j=0;j<arr[i].length;j++){
        res+=String.format((j==0)?"\"%s\"":", \"%s\"", arr[i][j]);
      }
      
      res+="]";

    }
    res+=(matr)?"\n]":"]";

    System.out.println(res);
  }

  public static void array2str(String[][] arr){
    array2str(arr, false);
  }

  public static void array2str(String[] arr){
    String res="[";
    for(int i=0;i<arr.length;i++){
      res+=String.format((i==0)?"\"%s\"":", \"%s\"", arr[i]);
    }
    res+="]";

    System.out.println(res);
  }

  //my function to get absolute value
  public static int abs(int num){
    return (num & ~(num>>31)) | ((~num+1) & (num>>31));
  }

}
