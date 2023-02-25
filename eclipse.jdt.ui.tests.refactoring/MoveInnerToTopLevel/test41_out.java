test;
[p] {
[B]
    package p;
  class B {
  	@Deprecated
  	static @Stuff final String TAG1= "tag1";
  	@Deprecated
  	@Stuff
  	static final String TAG2;
  	@Deprecated
  	@Stuff
  	private static final String TAG_END= "z" + 9;
  }
[A]
    package p;
  
  public class A {
  	String X= B.TAG1, Y= B.TAG2;
  }
  
}
