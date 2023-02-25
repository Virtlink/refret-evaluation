test;
[Test]
    class Test {
      public static final int BAR = 2;
    void foo() {
      System.out.println(EEnum.FOO.getValue());
    }
  }
[Usage]
    class Usage {
    void foo() {
      EEnum i = EEnum.FOO;
    }
  
    void bar(int i ) {
      i = B;
    }
  }
[EEnum]
    public enum EEnum {
      FOO(0);
      private int value;
  
      public int getValue() {
          return value;
      }
  
      EEnum(int value) {
          this.value = value;
      }
  }
