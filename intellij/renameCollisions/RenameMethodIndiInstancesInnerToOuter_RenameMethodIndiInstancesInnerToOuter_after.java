test;
[RenameMethodIndiInstancesInnerToOuter]
    public class RenameCollisions {
      public void method() {
      }
  
      public static class StaticInnerClass {
          public void <caret>method() {
          }
          public void instanceContext() {
              method();
          }
      }
  
      public void instanceContext() {
          method();
      }
  }
  
