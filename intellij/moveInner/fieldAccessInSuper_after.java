test;
[p] {
[B]
    package p;
  
  class B extends S{
      private final A a;
  
      public B(A a) {
      super(a.foo());
          this.a = a;
      }
  }
  
[S]
    package p;
  
  class S {
    public S(int i){}
  }
[A]
    package p;
  
  class A {
      int foo(){}
  }
}