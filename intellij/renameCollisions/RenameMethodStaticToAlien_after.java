test;
[RenameCollisions]
    import static java.lang.String.valueOf;
  
  public class RenameCollisions {
      public static class StaticInnerClass {
          public static void valueOf<caret>() {}
          public static void staticContext() {
              String.valueOf(0);
          }
      }
  }
  
