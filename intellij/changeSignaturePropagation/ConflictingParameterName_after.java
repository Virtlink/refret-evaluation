test;
[Test]
    class CallChain {
      private void depth1() {
          depth2("My first parameter");
      }
  
      private void depth2(String param, String param) {
          depth3(param);
      }
  
      private void depth3(String param) {
          System.out.println("hello there");
      }
  }
