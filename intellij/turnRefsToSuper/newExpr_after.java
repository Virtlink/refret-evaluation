test;
[Main]
    import java.util.*;
  
  interface Int {
  }
  
  class Impl implements Int {
      void foo() {
      }
  }
  
  class Usage {
    void f() {
        List<Impl> l = new ArrayList<Impl>();
        l.get(0).foo();
  
  
        List<Int> l1 = new ArrayList<Int>();
        Int i = l1.get(0);
  
  
        List<Impl> l2 = new ArrayList<Impl>();
        Impl i2 = l2.get(0);
        i2.foo();
    }
  }
  
