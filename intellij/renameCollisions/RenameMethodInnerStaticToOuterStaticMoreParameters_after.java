test;
[RenameCollisions]
    public class RenameCollisions {
      public static void staticMethod() {
      }
      public static class StaticInnerClass {
          public static void staticMethod(String s) {
          }
          public void instanceContext() {
              RenameCollisions.staticMethod();
              staticMethod("a");
          }
          public static void staticContext() {
              RenameCollisions.staticMethod();
              staticMethod("b");
          }
      }
  }
  
