test;
[FieldAsConstructorParameter]
    class ParentCtor {
      public ParentCtor(String s) {
      }
  }
  
  class Usage {
      public void test() {
          ParentCtor c = new ParentCtor("") {
              private static final String CONST = "";
          };
      }
  }
