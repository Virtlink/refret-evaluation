test;
[ConvertToInstanceMethodOfTheSameClass]
    
  class Bar {
      void foo() {
      }
  
      void m(){
      foo();
    }
  
    {
      Runnable r = this::foo;
    }
  
    static {
      Runnable r = new Bar()::foo;
    }
  }
  
  class Bar1 {
    void m() {
      new Bar().foo();
    }
    {
      Runnable r = new Bar()::foo;
    }
  }
