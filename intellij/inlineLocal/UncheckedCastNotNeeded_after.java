test;
[Test]
    import java.util.*;
  
  class X {
    List getChildren() {
      return null;
    }
  
    void iterate() {
        foo(getChildren());
    }
    void foo(List<X> l){}
  }
