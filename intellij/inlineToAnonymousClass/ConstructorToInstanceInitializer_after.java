test;
[Test]
    class A {
      private Object b = new Object() {
          {
              // this does some stuff
              doStuff();
              /* isn't this interesting? */
          }
        
          public String doStuff() {
              return "A";
          }
      };
  
  }
