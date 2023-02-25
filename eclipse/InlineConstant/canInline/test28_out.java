test;
[p] {
[Const]
    package p;
  
  import q.UsedClass;
  
  class Const {
  	{
  		new UsedClass[]{}[0] = null;
  	}
  }
  
[AnotherClass]
    package p;
  
  import q.UsedClass;
  
  public class AnotherClass {
  	{
  		new UsedClass[]{}[0] = null;
  	}
  }
  
}
[q] {
[UsedClass]
    package q;
  public class UsedClass {
  }
  
}
