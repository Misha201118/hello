import java.util.Arrays;

public class Third {
  public static void main(String[] args){
    int[] a={2,7,-2,-7,3,0,8,12,5};
    int[][] b = {{5, 0, 7},{9,-422},{964,8,0,-76},{8,349}};
    int[][] sqmatr = {
      {1,8,0,3},
      {3,8,-5,0},
      {378,-56,0,453},
      {6,-7,0,12}
    };
    avSum(b);
    System.out.println("====================");

    //array2str(b,true);
    minCol(b);
    System.out.println("====================");

    rowSum(b);
    System.out.println("====================");

    //array2str(sqmatr, true);
    diagChek(sqmatr);
    System.out.println("====================");

    //array2str(sqmatr, true);
    diagSumEq(sqmatr);
    System.out.println("====================");

    //array2str(sqmatr, true);
    rDiagSum(sqmatr);
    System.out.println("====================");

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

  public static void avSum(int[][] arr){
    int count=0;
    int summ=0;
    for(int i=0;i<arr.length;i++){
      
      for(int j=0;j<arr[i].length;j++){
	summ+=arr[i][j];
        count++;
      }
      
    }
    System.out.println((count!=0)?summ/count:"inf");
  }

  public static void minCol(int[][] arr){
    int len=0;
    for(int i=0;i<arr.length;i++){
      len = len<arr[i].length ? arr[i].length : len ;
    }
    
    int[] min_cols = new int[len];
    byte[] first = new byte[len/8+1];
    Arrays.fill(first, (byte) -1);

    byte bit;
    byte el;

    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
	bit= (byte) (j%8);
	el= (byte) (j/8);

	//System.out.printf("%-3d:%-3d", j, el);

      	switch((first[el]>>>bit)&1){
          case 0:
	    min_cols[j] = (min_cols[j]>arr[i][j])?arr[i][j]:min_cols[j];
	    break;

	  default:
	    min_cols[j]=arr[i][j];
	    first[el] = (byte) ~(~first[el] | (1<<bit));

	}

      }
    }

    array2str(min_cols);
  }

  public static void rowSum(int[][] arr){
    int[] sum = new int[arr.length];
    Arrays.fill(sum, 0);

    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        sum[i]+=arr[i][j];
      }
    }

    array2str(sum);
  }

  public static void diagChek(int[][] arr){
    for(int i=0;i<arr.length;i++){
      if(arr[i][i]<0){
        System.out.println(false);
	return;
      }
    }
    System.out.println(true);
  }

  public static void diagSumEq(int[][] arr){
    int[] sum={0,0};

    for(int i=0;i<arr.length;i++){
      sum[0]+=arr[i][i];
      sum[1]+=arr[i][arr.length-i-1];
    }

    System.out.printf("right diag: %d\nleft diag: %d\nequal: %b\n", sum[1], sum[0], sum[1]==sum[0]);
  }

  public static void rDiagSum(int[][] arr){
    int sum=0;

    for(int i=0;i<arr.length;i++){
      sum+=arr[i][arr.length-i-1];
    }

    System.out.printf("right diag: %d\n", sum);
  }

}
