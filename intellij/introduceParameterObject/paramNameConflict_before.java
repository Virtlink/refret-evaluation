test;
[Test]
    class Test {
    void foo(int... i) {
      if (i.lenght == 0) {
      }
      Param param = null;
    }
  
    void bar(){
      foo(1, 2);
    }
  }
[Param]
    public class Param {
      private final int[] i;
  
      public Param(int... i) {
          this.i = i;
      }
  
      public int[] getI() {
          return i;
      }
  }
  
