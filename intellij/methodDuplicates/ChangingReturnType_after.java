test;
[A]
    public class A {
      private B myField;
  
      public void method() {
          String a = getField().bbb.xxx();
      }
  
      public B getField() {
          return myField;
      }
  
      private static class B {
          private C bbb;
      }
  
      private static class C {
          String xxx() {return null;}
      }
  }
  
