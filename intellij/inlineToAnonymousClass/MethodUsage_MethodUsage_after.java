test;
[MethodUsage]
    class A {
      private Object b = new Object() {
          public String toString() {
              return getMyStringRepresentation();
          }
  
          public String getMyStringRepresentation() {
              return "q";
          }
      };
    
  }
