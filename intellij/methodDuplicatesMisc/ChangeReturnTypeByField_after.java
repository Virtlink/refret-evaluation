test;
[Test]
    class Test {
      private B myField;
  
      public void method() {
          Object o = foo();
          String a = foo().bbb.xxx();
      }
  
      private B foo(){
          return myField;
      }
  
      private static class B {
          private C bbb;
      }
  
      private static class C {
          String xxx() {return "";}
      }
  
  }
