test;
[Test]
    
  interface Vector<M> {
    M get(int i);
  }
  class Test {
  
    private static void call(Vector args_) {
  
        String s = ((Vector<String>) args_).get(0);
    }
  }
