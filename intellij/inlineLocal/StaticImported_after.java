test;
[Statics]
    import java.util.ArrayList;
  import java.util.List;
  
  import static Statics._emptyList;
  
  public class Statics {
  
    public static <T> List<T> _emptyList() {
      return new ArrayList<T>();
    }
  }
  
  
  class Foo {
    public static void main(String[] args) {
        doSomething(Statics.<String>_emptyList());
    }
  
    public static void doSomething(List<String> list) {
  
    }
  }
