test;
[A]
    import java.util.Map;
  import java.util.Set;
  
  public class A {
      public String get(String k) {
          return foo().get(k);
      }
  
      public Set<String> getAll(String x) {
          return foo().keySet();
      }
  
      public Map<String, String> foo() {
        return buildMap();
      }
  
      public Map<String, String> buildMap() {
          return null;
      }
  
  }
