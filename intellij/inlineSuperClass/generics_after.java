test;
[Usage]
    import p.Test;
  
  class Usage {
    Test<String> myField;
  
    Test<String> xxx(){
      return myField;
    }
  
    Test<Integer> xxxxx() {
      return null;
    }
  
    void bar(Test<String> s) {
      s.foo(null);
    }
  
  
  }
[p] {
[Test]
    package p;
  
  public class Test<R> extends SSuper<java.util.Map<T, T>> {
      public void foo(R t) {
        System.out.println("Hello");
      }
  }
}
