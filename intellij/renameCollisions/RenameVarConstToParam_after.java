test;
[RenameCollisions]
    public class RenameCollisions {
      private class InnerClass {
          public static final int param3<caret> = 13;
          public void instanceContext(int param3) {
              int localVar3 = 0;
              int var1 = localVar3 + param3 + InnerClass.param3;
          }
      }
  }
  
