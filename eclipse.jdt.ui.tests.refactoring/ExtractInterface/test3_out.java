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
  
  import java.util.ArrayList;
  import java.util.List;
  
  class A implements I{
  	public void m(){
  		List list= new ArrayList();
  	}
  }
}
