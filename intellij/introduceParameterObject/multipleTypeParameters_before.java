test;
[Test]
    class Test<G, R> {
    void foo(R r) {
      if (r == null) {
      }
    }
  
    void bar(R r){
      foo(r);
    }
  }
[A]
    class A<G, T> extends Test<G, T>{
    void foo(T t){}
  }
