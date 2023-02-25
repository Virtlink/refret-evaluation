test;
[p1] {
[Super]
    package p1;
  public class Super<T> extends SSuper<java.util.Map<T, T>> {
     public void foo(T t) {
       System.out.println("Hello");
     }
  }
}
[Usage]
    import p1.*;
  class Usage {
    Super<String> myField;
  
    Super<String> xxx(){
      return myField;
    }
  
    Super<Integer> xxxxx() {
      return null;
    }
  
    void bar(Super<String> s) {
      s.foo(null);
    }
  
  
  }
[p] {
[Test]
    package p;
  import p1.*;
  public class Test<R> extends Super<R> {} 
}
