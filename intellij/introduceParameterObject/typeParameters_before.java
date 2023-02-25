test;
[Test]
    class Test<R> {
    void foo(R r) {
      if (r == null) {
      }
    }
  
    void bar(R r){
      foo(r);
    }
  }
[A]
    class A<T> extends Test<T>{
    void foo(T t){}
  }
