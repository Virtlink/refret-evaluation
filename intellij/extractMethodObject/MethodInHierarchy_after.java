test;
[Test]
    class Test {
    void bar() {
      new B<String>().foo("");
    }
  
    class A<T> {
      void foo(T t){}
    }
  
    class B<E> extends A<E> {
      void foo(E e){
          new InnerClass(e).invoke();
      }
  
        private class InnerClass {
            private E e;
  
            public InnerClass(E e) {
                this.e = e;
            }
  
            public void invoke() {
                System.out.println(e);
            }
        }
    }
  }
  
  
