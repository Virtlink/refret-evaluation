test;
[NewExpressionContext]
    class A {
      private Object b = new Object() {
          public String toString() {
              return "A";
          }
      };
      private Object c = new Object() {
          public void doStuff(Object i) {
          }
      };
  
  }
