test;
[Test]
    class Test {
    void foo(Param param) {
      if (param.i() == 0) {
      }
    }
  
    void bar(){
      foo(new Param(1));
    }
  }
[Param]
    public record Param(int i) {
  }
