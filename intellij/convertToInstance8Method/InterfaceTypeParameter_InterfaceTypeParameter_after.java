test;
[InterfaceTypeParameter]
    interface Intf<T> {
      default X<T> method(T value) {
          T v = get();
          return new X<T>(v,value);
      }
  
      T get();
  }
  
  class Impl<V> implements Intf<V> {
  }
  
  class X {
  }
