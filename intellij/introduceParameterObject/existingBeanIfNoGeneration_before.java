test;
[Test]
    class Test {
    void foo(int i) {
      if (i == 0) {
        i++;
      }
    }
  
    void bar(){
      foo(1, 2);
    }
  }
[Param]
    public class Param {
      private final int i;
  
      public Param(int i) {
          this.i = i;
      }
  
      public int getI() {
          return i;
      }
  }
  
