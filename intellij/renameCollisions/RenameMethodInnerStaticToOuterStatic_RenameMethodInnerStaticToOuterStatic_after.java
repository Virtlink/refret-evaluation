test;
[RenameMethodInnerStaticToOuterStatic]
    public class RenameCollisions {
      public static void staticMethod() {
      }
      public static class StaticInnerClass {
          public static void staticMethod<caret>() {
          }
          public void instanceContext() {
              RenameCollisions.staticMethod();
              staticMethod();
          }
          public static void staticContext() {
              RenameCollisions.staticMethod();
              staticMethod();
          }
      }
  }
  
