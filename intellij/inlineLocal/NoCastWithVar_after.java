test;
[Test]
    
  import java.util.Arrays;
  import java.util.stream.Stream;
  
  class Main {
      public static void main(String[] args) {
          var stream2 = Stream.of(Arrays.asList("1"), Arrays.asList(1)).map(list -> list);
  
      }
  }
