test;
[p] {
[Const]
    package p;
  
  import q.UsedClass;
  
  class Const {
  	public static final UsedClass someArr2[] = {};
  	{
  		someArr2[0] = null;
  	}
  }
  
[AnotherClass]
    package p;
  
  public class AnotherClass {
  	{
  		Const.someArr2[0] = null;
  	}
  }
  
}
[q] {
[UsedClass]
    package q;
  public class UsedClass {
  }
  
}
