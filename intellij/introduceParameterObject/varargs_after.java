test;
[Test]
    class Test {
    void foo(Param param) {
      if (param.i().lenght == 0) {
      }
    }
  
    void bar(){
      foo(new Param(1, 2));
    }
  }
[Param]
    public record Param(int... i) {
  }
