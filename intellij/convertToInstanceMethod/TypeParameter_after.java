test;
[Test]
    class C<T> {
      void method(T value, X<T> x) {
          T v = get();
          System.out.println(v + " " + value);
      }
  
      T get() { return null; }
  }
