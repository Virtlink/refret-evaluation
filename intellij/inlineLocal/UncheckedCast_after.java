test;
[Test]
    import java.util.*;
  
  class X {
    List getChildren() {
      return null;
    }
  
    void iterate() {
        for (X x : (List<X>) getChildren()) {}
    }
  }
