test;
[ClassInitializer]
    class A {
      private Object b = new Object() {
          {
              // class initializer
          }
  
          public String toString() {
              return "A";
          }
      };
  
  }
