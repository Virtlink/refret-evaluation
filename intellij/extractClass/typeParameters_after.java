test;
[Test]
    class Test<T, U> {
  
      private final Extracted<T, U> extracted = new Extracted<T, U>();
  
      public T foo(U u) {
          return extracted.foo(u);
      }
  
      public void goo(T t, U u){
          t = extracted.foo(u)
      }
  }
[Extracted]
    public class Extracted<T, U> {
      public Extracted() {
      }
  
      public T foo(U u) {
          return null;
      }
  }
