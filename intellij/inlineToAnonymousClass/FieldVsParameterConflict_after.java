test;
[Test]
    class A {
      public void doTest() {
          final Throwable t1 = new Throwable("t");
          Object b = new Object() {
              private Throwable t = t1;
              private String myMessage;
  
              {
                  String msg = this.t.getMessage();
                  myMessage = msg;
              }
  
              public String toString() {
                  return "A";
              }
          };
      }
    
  }
