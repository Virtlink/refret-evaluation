test;
[RenameCollisions]
    public class RenameCollisions {
      public static class StaticInnerClass {
          public static final int CASE_INSENSITIVE_ORDER<caret> = 9;
          public static void staticContext() {
              String.CASE_INSENSITIVE_ORDER.getClass();
          }
      }
  }
  
