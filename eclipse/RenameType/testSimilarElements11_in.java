test;
[p] {
[SomeClass]
    package p;
  public class SomeClass{
  
  	SomeClass someClass;
  	static SomeClass fsSomeClass;
  
  	/**
  	 * @return Returns the someClass.
  	 */
  	public SomeClass getSomeClass() {
  		return someClass;
  	}
  
  	/**
  	 * @param a The a to set.
  	 */
  	public void setSomeClass(SomeClass a) {
  		this.someClass = a;
  	}
  
  
  };
  
[SomeOtherClass]
    package p;
  
  public class SomeOtherClass {
  
  	SomeClass fSomeClass;
  
  	/**
  	 * @return Returns the someClass.
  	 */
  	public SomeClass getSomeClass() {
  		return fSomeClass;
  	}
  
  	/**
  	 * @param a The a to set.
  	 */
  	public void setSomeClass(SomeClass a) {
  		fSomeClass = a;
  	}
  
  }
  
}
