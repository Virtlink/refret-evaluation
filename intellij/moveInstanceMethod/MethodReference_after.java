test;
[Test]
    interface SAM {
    String m(MethodReference<String> f, F f1);
  }
  
  
  class F {
      String getX() {
        return null;
      }
  }
  
  class MethodReference<X> {
  
      static void test() {
      SAM s = (stringMethodReference, f1) -> f1.getX();
    }
  }
