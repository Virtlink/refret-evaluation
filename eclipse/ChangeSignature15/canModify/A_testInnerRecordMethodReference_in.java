test;
[p] {
[A]
    package p;
  
  import java.util.*;
  
  class C {
  	public void bar() {
  		List<A.B> people = new ArrayList<>();
  		Collections.sort(people, Comparator.comparing(A.B::m)); // Case1 w/o space
  		Collections.sort(people, Comparator.comparing(A . B :: m));// Case2 with space
  	}
  }
  
  public record A(int a , char c) {
  	public record B(int x , String y) {
  		String m() {
  			return y;
  		}
  	}
  }
}
