test;
[Test]
    class Test {
    void bar(A a){
      a.foo();
    }
    class A {
      void foo(){
          new InnerClass().invoke();
      }
  
        private class InnerClass {
            public void invoke() {
                int i = 0;
            }
        }
    }
  }
