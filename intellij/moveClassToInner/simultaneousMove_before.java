test;
[pack2] {
[A]
    package pack2;
  
  public class A {
  }
  
}
[pack1] {
[Class1]
    package pack1;
  
  import pack0.*;
  
  /**
   * pack0.Class0
   */
  public class Class1 {
    Class0 cl0;
  }
}
[packUser] {
[Class2]
    package packUser;
  
  import pack1.Class1;
  import pack0.Class0;
  
  /**
   * pack1.Class1
   * pack0.Class0
   */
  public class Class2 {
    Class1 myClass1;
    Class0 myClass0;
  }
}
[pack0] {
[Class0]
    package pack0;
  
  import pack1.*;
  
  /**
   * pack1.Class1
   */
  public class Class0 {
    Class1 cl1;
  }
}
