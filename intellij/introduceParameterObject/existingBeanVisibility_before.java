test;
[p2] {
[Test]
    package p2;
  class Test {
    void foo(int... i) {
      if (i.lenght == 0) {
      }
    }
  
    void bar(){
      foo(1, 2);
    }
  }
}
[p] {
[Param]
    package p;
  class Param {
      private final int[] i;
  
      Param(int... i) {
          this.i = i;
      }
  
      public int[] getI() {
          return i;
      }
  }
  
}
