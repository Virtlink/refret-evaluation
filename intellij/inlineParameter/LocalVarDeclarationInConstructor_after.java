test;
[Test]
    class Base {
      public Base() {
      }
  }
  
  class Inheritor extends Base {
      public Inheritor() {
          super();
          String bar = "bar".toString();
          System.out.println(bar);
      }
  
      public static void main(String[] args) {
          new Inheritor();
      }
  }
