test;
[SuperInsideHierarchy]
    class A {
    void foo(){
      //do smth in A
    }
  }
  
  class B {
  
      void test(){
          super.foo();
      }
  
    void foo() {
      //do smth
    }
  }
