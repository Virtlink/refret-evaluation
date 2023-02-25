test;
[Test]
    class Test {
    void foo(Param param) {
      if (param.getI().lenght == 0) {
      }
    }
  
    void bar(){
      foo(new Param(1, 2));
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
  
