test;
[p] {
[S]
    package p;
  
  class S {
    public S(int i){}
  }
[A]
    package p;
  
  class A {
      int foo(){}
      private class B extends S{
        public B() {
          super(A.this.foo());
        } 
      }
  }
}
