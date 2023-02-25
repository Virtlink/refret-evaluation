test;
[B]
    class B extends Test {
    void foo(int i) {
      System.err.println(--i);
    }
  
    void bar() {
      foo(1);
    }
  }
[Test]
    class Test {
    void foo(int i) {
      i++;
    }
  
    void bar(){
      foo(1);
    }
  }
[A]
    class A extends Test{
     void foo(int i) {
       System.out.println(i++);
     }
  
     void bazz(){
       foo(0);
     }
  }
