test;
[p] {
[I]
    package p;
  import java.io.IOException;
  import java.util.Set;
  import java.util.List;
  /** typecomment template*/
  interface I {
  	List m(Set set, Set set1) throws IOException;
  }
[A]
    package p;
  
  import java.io.IOException;
  import java.util.List;
  import java.util.Set;
  
  class A implements I{
  	public List m(Set set, Set set1) throws IOException{
  		return null;
  	}
  }
}
