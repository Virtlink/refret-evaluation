test;
[RenameCollisions]
    public class RenameCollisions {
      public void <caret>siMethod() {
      }
  
      public static class StaticInnerClass {
          public void siMethod() {
          }
          public void instanceContext() {
              siMethod();
          }
      }
  
      public void instanceContext() {
          siMethod();
      }
  }
  
