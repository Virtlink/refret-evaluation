test;
[Test]
    class Test <T> {
  }
  
  class I extends Test<String>{
      void foo(String t) {
        String tt = t;
      }
  }
