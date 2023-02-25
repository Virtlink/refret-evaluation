test;
[Test]
    class Test {
    void foo(Param param) {
      if (param.getI() == 0) {
          param.setI(9);
      }
    }
  
    void bar(){
      foo(new Param(1));
    }
  }
[Param]
    public class Param {
      private int i;
  
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
  
