test;
[Super]
    import java.util.*;
  public class Super<T> {
  
  }
  
  class Test extends Super<String>{
    void bar() {
        List<String> l = new ArrayList<String>();
        for (String t : l) {
          System.out.println(t);
        }
    }
  }
