test;
[Test]
    class Test {
      private final Extracted extracted = new Extracted();
  
      public <T> void foo(T p) {
          extracted.foo(p);
      }
  
    public static void main(String[] args) {
      new Test().foo(10f);
    }
  
  }
[Extracted]
    public class Extracted {
      public Extracted() {
      }
  
      public <T> void foo(T p) {
          System.out.println(p.getClass().getName());
      }
  }
