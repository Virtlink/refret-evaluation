test;
[Test]
    class Test<T> {
  
      /**
    * {@link Extracted#myT}
    */
    void bar(){
    }
  }
[Extracted]
    public class Extracted<T> {
      T myT;
  
      public Extracted() {
      }
  }
