test;
[InferredType]
    import java.util.*;
  class Test {
      private static <T> List<T> bar(List<T> xs) { return xs; }
      private static void gazonk() {
          List<String> ss = bar(Collections.<String>emptyList());
      }
  }
  
