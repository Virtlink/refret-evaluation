test;
[Test]
    class A {
      private Object b = new Exception("w", new Throwable()) {
          public String getMessage() {
              return "q";
          }
      };
  
  }
