test;
[Test]
    class Inference {
          public <T> T getX() {
              return null;
          }
  
          void foo (String s) {}
  
          {
              foo(new Inference().<String>getX());
          }
  }
