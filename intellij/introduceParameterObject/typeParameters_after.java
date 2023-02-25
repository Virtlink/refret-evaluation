test;
[Test]
    class Test<R> {
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
    class A<T> extends Test<T>{
    void foo(Param<T> param){}
  }
