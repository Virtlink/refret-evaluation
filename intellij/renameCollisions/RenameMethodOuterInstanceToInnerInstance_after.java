test;
[RenameCollisions]
    public class RenameCollisions {
      public void <caret>innerMethod() {
      }
      class InnerClass {
          public void innerMethod() {
          }
          public void instanceContext() {
              RenameCollisions.this.innerMethod();
              innerMethod();
          }
      }
  }
  
