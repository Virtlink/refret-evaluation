test;
[Test]
    import java.util.List;
  
  class Types {
    private List<String> myList;
  
    public String method(List<String> v) {
      return v.get(0);
    }
  
    public void context() {
      String s = method(myList);
    }
  }
