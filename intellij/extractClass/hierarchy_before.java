test;
[Test]
    class Test<R>  extends A <R>{
    public R myT;
  
    void foo(R t){}
  
    void bar(){
      foo(myT);
    }
  }
[A]
    class A<T>{
    void foo(T t){}
  }
