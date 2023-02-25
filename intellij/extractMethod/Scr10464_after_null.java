test;
[Scr10464]
    class Test {
      public Object method() {
          newMethod();
          return null;
      }
  
      private void newMethod() {
          bar();
      }
  
      public void bar() {
      }
  }
