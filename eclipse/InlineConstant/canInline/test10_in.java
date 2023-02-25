test;
[p2] {
[B]
    // 9, 28 -> 9, 37  replaceAll == false
  package p2;
  
  import p1.A;
  
  class B {
  
  	public static void main(String[] args) {
  		System.out.println(A.ELYSIUM);	
  	}	
  }
}
[p1] {
[A]
    package p1;
  
  public class A {
  	public static final String EARTH= "Elysium";
  
  	public static final String ELYSIUM= EARTH;	
  }
}
