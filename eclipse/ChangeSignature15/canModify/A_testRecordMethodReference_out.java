test;
[p] {
[A]
    package p;
  
  import java.util.*;
  
  class B {
  	public void bar() {
  		List<A> people = new ArrayList<>();
  		Collections.sort(people, Comparator.comparing(A::newName)); // Case1 w/o space
  		Collections.sort(people, Comparator.comparing(A :: newName));// Case2 with space
  	}
  }
  
  public record A(int a , char c) {
  	String newName() {
  		return null;
  	}
  }
}
