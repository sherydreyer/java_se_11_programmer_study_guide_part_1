package chapter4;

public class FindInMatrixUsingReturn {
    private static int[] searchForValue(int[][] list, int v) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == v) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2 } };
        int searchValue = 2;
        int[] results = searchForValue(list,searchValue);
        if (results == null) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: " + "(" + results[0] + "," + results[1] + ")");
        }

//        Unreachable Code
//        One facet of break, continue, and return that you should be aware of is
//        that any code placed immediately after them in the same block is
//        considered unreachable and will not compile. For example, the
//        following code snippet does not compile:
        int checkDate = 0;
        while(checkDate<10) {
            checkDate++;
            if(checkDate>100) {
                break;
           //     checkDate++; // DOES NOT COMPILE
            }

            int minute = 1;
//            WATCH: while(minute>2) {
//                if(minute++>2) {
//                    continue WATCH;
//                    System.out.print(minute); // DOES NOT COMPILE not reachable
//                }
//            }
            int hour = 2;
            switch(hour) {
          //      case 1: return; hour++; // DOES NOT COMPILE, not reachable
                case 2:
            }
        }

    }
}
