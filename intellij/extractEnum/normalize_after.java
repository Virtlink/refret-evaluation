test;
[Test]
    class Test {
      void foo() {
      System.out.println(EEnum.FOO.getValue());
    }
  }
[Usage]
    class Usage {
    void foo(EEnum i) {
          switch (i) {
              case FOO:
                  break;
              case BAR:
                  break;
          }
      }
  
      void foobar() {
          foo(EEnum.FOO);
          foo(EEnum.BAR);
      }
  }
[EEnum]
    public enum EEnum {
      FOO(0), BAR(2);
      private int value;
  
      public int getValue() {
          return value;
      }
  
      EEnum(int value) {
          this.value = value;
      }
  }
