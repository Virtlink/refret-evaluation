test;
[p2] {
[Test]
    package p2;
  
  import p.Param;
  
  class Test {
    void foo(Param param) {
      if (param.getI().lenght == 0) {
      }
    }
  
    void bar(){
      foo(new Param(1, 2));
    }
  }
}
[p] {
[Param]
    package p;
  public class Param {
      private final int[] i;
  
      public Param(int... i) {
          this.i = i;
      }
  
      public int[] getI() {
          return i;
      }
  }
  
}
