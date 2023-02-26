test;
[RenameCollisions]
    public class RenameCollisions {
      public static final int <caret>localVar3 = 5;
      private int myField = 7;
  
      public static class StaticInnerClass {
          public static final int SI_STATIC_FIELD = 9;
          private int mySiField = 11;
  
          public void instanceContext(int param1) {
              int localVar1 = 0;
              int var1 = localVar1 + param1 + SI_STATIC_FIELD + mySiField + localVar3;
          }
          public static void staticContext(int param2) {
              int localVar2 = 0;
              int var1 = localVar2 + param2 + SI_STATIC_FIELD + localVar3;
          }
      }
  
      private class InnerClass {
          public static final int INNER_STATIC_FIELD = 13;
          private int myInnerField = 15;
  
          public void instanceContext(int param3) {
              int localVar3 = 0;
              int var1 = localVar3 + param3 + INNER_STATIC_FIELD + myInnerField + RenameCollisions.localVar3 + myField;
          }
      }
  }
  
