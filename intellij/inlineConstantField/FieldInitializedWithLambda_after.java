test;
[Test]
    interface Consumer<T> {
    void accept(T t);
  }
  
  class Test {
    class X {
  
        X() {
        }
  
      void test() {
        ((Consumer<String>) s -> System.out.println(s)).accept("1");
      }
    }
  }
