test;
[RenameMethodInnerInstanceToOuterInstance]
    public class RenameCollisions {
      public void method() {
      }
      class InnerClass {
          public void <caret>method() {
          }
          public void instanceContext() {
              RenameCollisions.this.method();
              method();
          }
      }
  }
  
