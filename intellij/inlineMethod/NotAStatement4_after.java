test;
[Test]
    import java.util.*;
  
  class AAA {
  
      void foo() {
          Set<String> s1 = new HashSet<>();
          Set<String> s2 = new HashSet<>();
          if (s1.isEmpty()) {
              s1.add("foo");
              s2.add("foo");
          } else {
              s1.add("foo");
              s2.add("foo");
          }
      }
  }
