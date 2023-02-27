test;
[Test]
    class Test {
      public static final int [[@1|ID]]=0;

      public Test(int id) {
      }
  }

  class Rest {
      public static void test() {
          new Test([[->1|ID|Test.ID]]);
      }
  }
