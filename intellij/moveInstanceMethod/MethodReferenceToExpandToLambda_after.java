test;
[Test]
    
  class Bar {
  
  }
  
  class Bar1 {
  
    void m(Bar b) {
      Bar3 r = (i, b1) -> b1.foo(i);
    }
  
      void foo(int i) {
      }
  }
  
  interface Bar3 {
    void m(int i, Bar1 v);
  }
