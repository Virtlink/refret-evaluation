test;
[Test]
    class ChangeSignatureTest {
       private static void level1(Class clazz) {
          Runnable runnable = () -> level2(clazz);
          Runnable runnable1 = () -> { level2(clazz);};
          level2(clazz);
      }
  
      private static void level2(Class clazz) {
  
      }
  }
