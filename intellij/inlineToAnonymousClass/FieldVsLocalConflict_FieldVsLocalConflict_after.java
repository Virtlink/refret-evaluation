test;
[FieldVsLocalConflict]
    class A {
      public void doTest() {
          Throwable t = new Throwable("q");
          final Throwable t1 = new Throwable("t");
          Object b = new Object() {
              private String myMessage;
  
              {
                  String msg = t1.getMessage();
                  myMessage = msg;
              }
  
              public String toString() {
                  return "A";
              }
          };
      }
    
  }
