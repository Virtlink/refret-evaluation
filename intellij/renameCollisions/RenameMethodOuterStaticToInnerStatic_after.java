test;
[RenameCollisions]
    public class RenameCollisions {
      public static void siStaticMethod<caret>() {
      }
  
      public static class StaticInnerClass {
          public static void siStaticMethod() {
          }
          public void instanceContext() {
              RenameCollisions.siStaticMethod();
              siStaticMethod();
          }
          public static void staticContext() {
              RenameCollisions.siStaticMethod();
              siStaticMethod();
          }
      }
  }
  
