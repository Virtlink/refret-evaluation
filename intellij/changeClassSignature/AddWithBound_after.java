test;
[Main]
    import java.util.Collection;
  import java.util.List;
  
  public class Main {
  
    class B<T extends Collection> {}
  
    public void someMethod() {
      B<List> b = new B<List>();
    }
  }
  
