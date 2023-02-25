test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I<T> {
  
  }
[A]
    package p;
  
  class A<T> implements I<T> {
  	I<?>[] a= new A<?>[1];
  }
  
}
