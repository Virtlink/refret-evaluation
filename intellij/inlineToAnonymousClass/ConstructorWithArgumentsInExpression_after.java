test;
[Test]
    class A {
      private Object b = new Exception("w".substring(0, 1)) {
          public String getMessage() {
              return "q";
          }
      };
  
  }
