test;
[p] {
[I]
    package p;
  
  import java.util.List;
  
  /** typecomment template*/
  interface I {
  
  	List m();
  
  }
[A]
    package p;
  
  import java.util.List;
  
  class A implements I{
  	public List m(){return null;}
  }
}
