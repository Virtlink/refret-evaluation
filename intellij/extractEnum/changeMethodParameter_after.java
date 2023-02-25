test;
[Test]
    public class Test {
  
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
      FOO(0), BAR(1);
      private int value;
  
      public int getValue() {
          return value;
      }
  
      EEnum(int value) {
          this.value = value;
      }
  }
