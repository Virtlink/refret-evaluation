test;
[Main]
    import java.util.Collection;
  import java.util.List;
  
  public class Main {
  
    class B<T extends Collection, X extends Long> {}
  
    public void someMethod() {
      B<List, Long> b = new B<>();
    }
  }
  
