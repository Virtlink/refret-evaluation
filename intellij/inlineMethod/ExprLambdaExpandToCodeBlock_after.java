test;
[Test]
    
  import java.util.Comparator;
  
  class InlineLambda {
      private static int compare(Integer i, Integer j) {
          if (i > j) {
              return 1;
          }
          if (j > i) {
              return -1;
          }
          return 0;
      }
  
      private static Comparator<Integer> COMP = (o1, o2) -> {
          if (o1 > o2) {
              return 1;
          }
          if (o2 > o1) {
              return -1;
          }
          return 0;
      };
  }
