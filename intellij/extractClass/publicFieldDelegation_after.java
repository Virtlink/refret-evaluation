test;
[Test]
    class Test<T> {
      public final Extracted<T> extracted = new Extracted<T>();
  
      void foo(T t){}
    void bar(){
      foo(extracted.myT);
    }
  }
[Extracted]
    public class Extracted<T> {
      public T myT;
  
      public Extracted() {
      }
  }
