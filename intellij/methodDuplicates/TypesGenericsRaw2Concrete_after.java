test;
[Test]
    import java.util.List;
  
  class Types {
    private List myList;
  
    public void method(List<String> v) {
      v.clear();
    }
  
    public void context() {
        method(myList);
    }
  }
