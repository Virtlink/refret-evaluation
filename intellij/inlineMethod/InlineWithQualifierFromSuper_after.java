test;
[Test]
    class Base {
      String id;
      public String getID() {
          return id;
      }
  }
  
  class Derived extends Base {
  
      static void usage(Derived element) {
          StringBuffer buffer = new StringBuffer();
          buffer.add(element.getID());
      }
  }
