test;
[TestInlining]
    public class TestInlining {
  
      public static final String FP = "fa".trim();
  
      enum MyEnum {
      A("foo".trim());
  
      MyEnum(String s) {
      }
    }
  
  }
