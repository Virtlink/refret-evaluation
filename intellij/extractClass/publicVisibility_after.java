test;
[Test]
    class Test<T> {
      final Extracted<T> extracted = new Extracted<T>();
  
      void bar(){
          extracted.foos();
    }
    void foos(){
        extracted.foos();
    }
  }
[Extracted]
    public class Extracted<T> {
      public T myT;
  
      public Extracted() {
      }
  
      public void foos() {
      }
  }
