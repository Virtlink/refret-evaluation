test;
[Test]
    class Test {
      void test() {
          int x = getX();
          System.out.println(x);
      }
  
      private static int getX() {
          int x = 42;
          return x;
      }
  }
