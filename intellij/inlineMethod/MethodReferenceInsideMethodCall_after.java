test;
[Test]
    
  import java.util.function.Supplier;
  class Foo {
  
      void o(){
      mm(() -> 1);
    }
  
    void mm(Supplier<Integer> r) {}
  }
