test;
[RenameCollisions]
    public class RenameCollisions {
      private int <caret>localVar3 = 7;
  
      private class InnerClass {
          public void instanceContext(int param3) {
              int localVar3 = 0;
              int var1 = localVar3 + param3 + RenameCollisions.this.localVar3;
          }
      }
  }
  
