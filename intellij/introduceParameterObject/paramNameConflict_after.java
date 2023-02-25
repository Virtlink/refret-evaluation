test;
[Test]
    class Test {
    void foo(Param param1) {
      if (param1.getI().lenght == 0) {
      }
      Param param = null;
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
  
