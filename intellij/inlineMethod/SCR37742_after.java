test;
[Test]
    import java.util.List;
  import java.util.ArrayList;
  
  class Test {
  
      void bar () {
          List<? extends String> l = new ArrayList<String>();
      }
  }
  
