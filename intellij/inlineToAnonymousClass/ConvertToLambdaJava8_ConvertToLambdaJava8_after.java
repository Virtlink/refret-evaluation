test;
[ConvertToLambdaJava8]
    import java.util.*;
  
  class Main {
  
      void sort(List<String> scores) {
          scores.sort((s1, s2) -> 0);
      }
  }
