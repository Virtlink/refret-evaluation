test;
[Test]
    class Test {
      void bar(int i) {
          new InnerClass(i).invoke();
      }
  
      void foo() {
          bar(5);
      }
  
      private class InnerClass {
          private int i;
  
          public InnerClass(int i) {
              this.i = i;
          }
  
          public void invoke() {
              if (i == 0) return;
              bar(i - 1);
          }
      }
  }
