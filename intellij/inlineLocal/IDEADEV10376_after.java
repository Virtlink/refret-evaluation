test;
[Test]
    class IDEADEV10376 {
      private static int f(int p) {
          int i = 0;
          i = f(9);
          return 0;
      }
  }
