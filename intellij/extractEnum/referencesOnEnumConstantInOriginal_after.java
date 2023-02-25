test;
[Test]
    class Test {
      void foo() {
      System.out.println(EEnum.FOO.getValue());
    }
  }
[EEnum]
    public enum EEnum {
      FOO("foo");
      private String value;
  
      public String getValue() {
          return value;
      }
  
      EEnum(String value) {
          this.value = value;
      }
  }
