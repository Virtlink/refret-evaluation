test;
[Test]
    class C {
      public void test() {
          Object i = new Object() {
              private int myA;
  
              {
                  process("a");
              }
  
              public void process(String s) {
                  myA = s.length();
              }
          };
      }
  }
