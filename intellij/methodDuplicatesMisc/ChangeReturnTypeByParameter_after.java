test;
[Test]
    class A {
  
      public void bar() {
          m(foo());
      }
  
      private String foo() {
          return "";
      }
  
      public void m(String ss) {}
  }
