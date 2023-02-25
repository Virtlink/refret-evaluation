test;
[p] {
[I]
    package p;
  
  import java.io.IOException;
  
  /** typecomment template*/
  interface I {
  
  	void m() throws IOException;
  
  }
[A]
    package p;
  
  import java.io.IOException;
  import java.util.ArrayList;
  import java.util.List;
  
  class A implements I{
  	public void m() throws IOException{
  		List list= new ArrayList();
  	}
  }
}
