test;
[InlineParms]
    public class Test {
  
      public void use1() {
          int p2 = y;
          p2++;
          int r = someMethod(x, p2);
      }
  
      public void use2() {
          int p2 = field1;
          p2++;
          int r = someMethod(field1, p2);
      }
  
      public void use3() {
          int p2 = field2;
          p2++;
          int r = someMethod(field2, p2);
      }
  
      public void use4() {
          int p2 = field3;
          p2++;
          int r = someMethod(field3, p2);
      }
  
      {
          field2++;
      }
  
      private final int field1;
      private int field2;
      private int field3;
  }
