test;
[TestSubclass]
    public class TestSubclass<T> extends Test {
  }
[Test]
    public class Test {
      interface A<T> {
        void foo(T t);
      }
  
      interface B<T> {
        void bar(T t);
      }
  }
  
