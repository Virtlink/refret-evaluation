test;
[RenameCollisions]
    import static java.lang.String.valueOf;
  
  public class RenameCollisions {
      public static class StaticInnerClass {
          public static final int CASE_INSENSITIVE_ORDER<caret> = 9;
          public static void staticContext() {
              valueOf(null);
          }
      }
  }
  
