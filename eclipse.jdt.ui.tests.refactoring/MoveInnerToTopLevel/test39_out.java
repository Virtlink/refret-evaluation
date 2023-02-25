test;
[p] {
[B]
    package p;
  class B {
  	static final String TAG1= "tag1";
  	static final String TAG2= "tag2";
  }
[A]
    package p;
  
  public class A {
  	String X= B.TAG1, Y= B.TAG2;
  }
  
}
