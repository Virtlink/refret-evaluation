test;
[p] {
[B]
    package p;
  class B {
  	@Deprecated
  	static final String TAG1= "tag1";
  	@Deprecated
  	private static final String TAG_m= null;
  	@Deprecated
  	static final String TAG2= "tag2";
  }
[A]
    package p;
  
  public class A {
  	String X= B.TAG1, Y= B.TAG2;
  }
  
}
