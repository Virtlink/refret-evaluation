test;
[p] {
[SomeClass2]
    package p;
  public class SomeClass2{
  
  	static SomeClass2 someClass2;
  	static SomeClass2 fsSomeClass2;
  	static SomeClass2 fsSomeClass2_suffix;
  	static SomeClass2 someClass2_suffix;
  
  };
  
[SomeOtherClass]
    package p;
  
  public class SomeOtherClass {
  
  	{
  		SomeClass2.someClass2= null;
  		SomeClass2.fsSomeClass2_suffix= null;
  	}
  
  }
  
}
