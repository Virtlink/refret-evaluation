test;
[p1] {
[Super]
    package p1;
  public class Super<T>{
     public void foo(T t) {
       System.out.println("Hello");
     }
  }
}
[Usage]
    import p1.*;
  class Usage {
    void bar(Super<Integer> s) {
      s.foo(null);
    }
  }
[p] {
[Test]
    package p;
  import p1.*;
  public class Test extends Super<String> {} 
}
