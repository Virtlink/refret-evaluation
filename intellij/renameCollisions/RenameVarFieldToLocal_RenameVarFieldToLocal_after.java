test;
[RenameVarFieldToLocal]
    public class RenameCollisions {
      private class InnerClass {
          private int localVar3<caret> = 15;
          public void instanceContext(int param3) {
              int localVar3 = 0;
              int var1 = localVar3 + param3 + this.localVar3;
          }
      }
  }
  
