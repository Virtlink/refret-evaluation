test;
[Test]
    class A {
      private Object b = new Object() {
          private int myInt = 100;
  
          public int getInt() {
  	    return myInt;
          }
      };
  
  }
