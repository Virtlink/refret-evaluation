test;
[RenameCollisions]
    public class RenameCollisions {
      private int myField = 7;
      private class InnerClass {
          private int myField<caret> = 15;
          public void instanceContext(int param3) {
              int localVar3 = 0;
              int var1 = localVar3 + param3 + myField + RenameCollisions.this.myField;
          }
      }
  }
  
