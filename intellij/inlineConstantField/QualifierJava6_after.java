test;
[Test]
    import java.util.*;
  
  class A {
  
      void m(boolean b) {
          List<String> l = b ? new ArrayList<String>() : Collections.<String>emptyList();
      }
  }
