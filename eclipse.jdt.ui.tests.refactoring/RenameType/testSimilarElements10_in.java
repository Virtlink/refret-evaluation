test;
[p] {
[SomeClass]
    package p;
  public class SomeClass{
  
  	static SomeClass someClass;
  	static SomeClass fsSomeClass;
  	static SomeClass fsSomeClass_suffix;
  	static SomeClass someClass_suffix;
  
  };
  
[SomeOtherClass]
    package p;
  
  public class SomeOtherClass {
  
  	{
  		SomeClass.someClass= null;
  		SomeClass.fsSomeClass_suffix= null;
  	}
  
  }
  
}
