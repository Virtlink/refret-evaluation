test;
[Test]
    class Foo {
      interface Jjj {
          int[] jjj(int p);
      }
      void useJjj(Jjj p) {
          p.jjj(9);
      }
      void test() {
          ((Jjj) int[]::new).jjj(9);
      }
  }
