test;
[Test]
    class Base<T> {
    void m(T clazz) {
    }
  }
  
  class A extends Base<String> {
    void x(String clazz) {
      m(clazz);
    }
  }
