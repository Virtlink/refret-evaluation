test;
[Test]
    import java.util.*;
  
  class A {
      public void test() {
          Comparator<String>[] b = new Comparator[1];
          b [0] = new Comparator<String>() {
              public int compare(String t1, String t2) {
                  return 0;
              }
          };
      }
  
  }
