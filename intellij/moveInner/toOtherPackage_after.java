test;
[package2] {
[InnerClass]
    package package2;
  
  import package1.AnotherPublic;
  
  public class InnerClass extends AnotherPublic {
    {
      foo();
    }
  }
  
}
[package1] {
[AnotherPublic]
    package package1;
  
  import package2.InnerClass;
  
  public class AnotherPublic {
     protected void foo(){}
  }
  
  class OuterClass {
    private InnerClass instance = new InnerClass();
  
  }
  
}
