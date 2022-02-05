package school.lessons;

public class HomeW {
    public static void main(String[] args) {
        //int arr[][] = new int[6][6];
        int a = 6;
        int arr [][] = new int[a][a];

        for (int i = 0; i < a; i++) {
            arr [i][i] = 1;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++)
               // System.out.print("%3d",arr [i][j]);
                System.out.print(arr [i][j]);
            System.out.println();
        }
        //for (int i = 1; i < 6; i++) {
        // for (int j = 0; j <= 6; j++) {
        //  if (i > j) {
        //     System.out.print("1");
        // } else if (i < j) {
        //System.out.print("0");
        // }
        //}
        // System.out.println();
        //for (int i = 0; i < arr.length; i++)
           // for (int j = 0; j < arr.length; j++) {
             //   if (i == j) {
              //      arr[i][j] = 1;
                //    System.out.print("1");

             //   } else {
              //      arr[i][j] = 0;
              //      System.out.print("0");

             //   }}
    }
}

//package school.lessons;

//public class HomeworkSeconds {
    //public static void main(String args[]) {
        //int N = 5;
      //  int arr[][] = new int[6][6];
     //   int i, j = 0;

       // for ( i = 0; i < 6; i++)
       //     for ( j = 0; j < 6; j++) {
        //        arr[i][j] = 1;
      //      }
      //  for ( i = 0; i < 6; i++) {
      //      for (j = 0; j <= 6; j++) {
       //         if (i > j) {
        //            arr[i][j] = 1;
                    //System.out.print("1" + arr[i][j]);
             //       System.out.print("0");
             //   } else {

               //     //else if (i < j) {
              //      System.out.print("1");
             //       //System.out.print(arr[i][j]);
            //    }

       //     }System.out.println();
      //  }}}
