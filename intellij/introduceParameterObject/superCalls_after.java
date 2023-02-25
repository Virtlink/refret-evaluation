test;
[B]
    class B extends Test {
    void foo(Param param) {
      super.foo(param);
      System.err.println(param.setI(param.getI() - 1));
    }
  
    void bar() {
      foo(new Param(1));
    }
  }
[Test]
    class Test {
    void foo(Param param) {
        param.setI(param.getI() + 1);
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
  
[A]
    class A extends Test{
     void foo(Param param) {
       super.foo(param);
       System.out.println(param.setI(param.getI() + 1));
     }
  
     void bazz(){
       foo(new Param(0));
     }
  }
