test;
[Super]
    
  class Super {
    native void foo();
  }
  
[Test]
    
  class Test extends Super {
    void foo() {
      super.foo();
    }
  }
  
