test;
[Test]
    import java.util.Collection;
  class Test {
    void foo() {
        for (Number extension : getExtensions()) {
      }
    }
  
    Collection<? extends Number> getExtensions() {return null;}
  }
  
  
