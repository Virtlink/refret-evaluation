test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  	void m();
  
  }
[A]
    package p;
  
  class A extends Object implements Cloneable, I{
  	public void m(){
  	}
  	protected Object clone() throws CloneNotSupportedException {
  		return super.clone();
  	}
  }
}
