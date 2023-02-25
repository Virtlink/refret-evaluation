test;
[p] {
[I]
    package p;
  import java.io.IOException;
  import java.util.List;
  import java.util.Set;
  /** typecomment template*/
  interface I {
  	List m(Set set) throws IOException;
  }
[A]
    package p;
  
  import java.io.IOException;
  import java.util.List;
  import java.util.Set;
  
  class A implements I{
  	public List m(Set set) throws IOException{
  		return null;
  	}
  }
}
