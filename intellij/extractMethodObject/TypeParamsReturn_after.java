test;
[Test]
    class Test {
    <T> T foo(){
        return new InnerClass<T>().invoke();
    }
  
      void bar(){
      String s = foo();
    }
  
      private class InnerClass<T> {
          public T invoke() {
              return null;
          }
      }
  }
