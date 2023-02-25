test;
[Test]
    public class Test {
  
      void foo() {
          EEnum i = foobar(false);
          switch (i) {
              case FOO:
                  break;
              case BAR:
                  break;
          }
      }
  
      EEnum foobar(boolean flag) {
          if (flag) {
              return EEnum.FOO;
          }
          return EEnum.BAR;
      }
  }
[EEnum]
    public enum EEnum {
      FOO(0), BAR(1);
      private int value;
  
      public int getValue() {
          return value;
      }
  
      EEnum(int value) {
          this.value = value;
      }
  }
