test;
[Test]
    class A {
      public void doTest() {
          final Throwable t = new Throwable("t");
          Object b = new Object() {
              private String myMessage;
  
              {
                  String msg = t.getMessage();
                  myMessage = msg;
              }
  
              public String toString() {
                  return "A";
              }
          };
      }
    
  }
