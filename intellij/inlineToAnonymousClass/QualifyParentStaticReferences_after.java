test;
[Test]
    class ParentCtor {
      public static final String PARENT_CONST = "";
  
      public ParentCtor(String s) {
      }
  }
  
  class Usage {
      public void test() {
          new ParentCtor(ParentCtor.PARENT_CONST);
      }
  }
  
