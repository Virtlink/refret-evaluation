test;
[p] {
[A]
    package p;
  
  import java.util.ArrayList;
  import java.util.List;
  
  public class A {
  	void foo() {
  		List l= new ArrayList();
  		l.add("Eclipse");
  		l.add(Integer.valueOf(10));
  		bar(l);
  	}
  	void bar(Object o) {
  		((List)o).add(new A());
  	}
  }
}
