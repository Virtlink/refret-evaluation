test;
[Test]
    class Test {
    void foo(Param param) {
      if (param.getI() == 0) {
          param.setI(param.getI() + 1);
      }
    }
  
    void bar(){
      foo(new Param(1));
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
  
      public void setI(int i) {
          this.i = i;
      }
  }
  
