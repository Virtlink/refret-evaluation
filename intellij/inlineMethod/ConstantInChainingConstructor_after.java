test;
[Test]
    class Test {
      public static final int ID=0;
  
      public Test(int id) {
      }
  }
  
  class Rest {
      public static void test() {
          new Test(Test.ID);
      }
  }
