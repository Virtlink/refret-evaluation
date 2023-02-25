test;
[Test]
    class Test<G, R> {
    void foo(Param<R> param) {
      if (param.r() == null) {
      }
    }
  
    void bar(R r){
      foo(new Param<>(r));
    }
  }
[Param]
    public record Param<R>(R r) {
  }
[A]
    class A<G, T> extends Test<G, T>{
    void foo(Param<T> param){}
  }
