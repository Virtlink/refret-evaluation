test;
[Test]
    import java.util.List;
  
  class Types {
    private List<String> myList;
  
    public void method(List v) {
      v.clear();
    }
  
    public void context() {
        method(myList);
    }
  }
