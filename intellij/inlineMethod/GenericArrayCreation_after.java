test;
[Test]
    
  import java.util.Optional;
  
  class Test
  {
      void x() {
          Optional<String>[] os = (Optional<String>[]) new Optional[]{Optional.empty()};
      }
  
  }
