test;
[ChangeClassSignatureAddParameter]
    public class ChangeClassSignatureAddParameter {
  
    public void test(Object object) {
      if (object instanceof MyClass) {
        MyClass<String> myClass = (MyClass<String>)object;
      }
    }
  }
  
  class MyClass<T> {
  }
