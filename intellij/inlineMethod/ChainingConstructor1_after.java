test;
[Test]
    class TestInlineMethod {
  
      /**
       * {@link #TestInlineMethod(String, int, String, int)}
       */
      public TestInlineMethod(Integer i1, Integer i2) {
      }
  
      public static void main(String[] args) {
          TestInlineMethod test = new TestInlineMethod(Integer.valueOf("10", 10), Integer.valueOf("A", 16));
      }
  }
