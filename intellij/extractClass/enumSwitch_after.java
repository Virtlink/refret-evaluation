test;
[Test]
    public class Test {
  
  }
  
  enum Person {
    FRED, GEORGE;
  }
[Extracted]
    public class Extracted {
      static void foo(Test t) {
          switch (p) {
              case FRED:
                  break;
  
              case GEORGE:
                  break;
          }
      }
  }
