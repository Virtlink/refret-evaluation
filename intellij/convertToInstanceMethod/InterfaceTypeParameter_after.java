test;
[Test]
    interface Intf<T> {
      X<T> method(T value);
  
      T get();
  }
  
  class Impl<V> implements Intf<V> {
      public X<V> method(V value) {
          V v = get();
          return new X<V>(v,value);
      }
  }
  
  class X {
  }
