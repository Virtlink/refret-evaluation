test;
[p] {
[A]
    package p;
  
  import java.util.ArrayList;
  import java.util.List;
  
  class A {
  	void foo() {
  		List<String> l= new ArrayList<String>();
  		l.add("Eclipse");
  		String eclipse= l.get(0);
  	}
  }
}
