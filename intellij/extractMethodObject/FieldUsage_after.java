test;
[Test]
    class Test{
    void foo(int i){
        new InnerClass(i).invoke();
    }
  
      void bar(Test t){
      t.foo(1);
    }
  
      private class InnerClass {
          private int i;
  
          public InnerClass(int i) {
              this.i = i;
          }
  
          public void invoke() {
              i++;
          }
      }
  }
