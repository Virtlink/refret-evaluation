test;
[p] {
[OtherClass]
    package p;
  
  public class OtherClass {
  
  	public OverriddenMethodClass getOverriddenMethodClass() {
  		return null;
  	}
  
  }
  
[OverriddenMethodClass]
    package p;
  
  public class OverriddenMethodClass extends OtherClass {
  
  	public OverriddenMethodClass getOverriddenMethodClass() {
  		return null;
  	}
  
  }
  
}
