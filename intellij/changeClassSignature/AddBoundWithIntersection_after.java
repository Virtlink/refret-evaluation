test;
[Test]
    import java.io.Serializable;
  
  class C<T extends Runnable & Serializable> {}
  
  class Some implements Runnable, Serializable {
      void m() {
        C<Some> c = new C<Some>();
      }
  }
