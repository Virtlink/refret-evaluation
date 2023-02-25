test;
[p] {
[B]
    package p;
  class B<E> {
  	/** Comment */
  	private A<E> a;
  
  	/**
  	 * @param a
  	 */
  	B(A<E> a) {
  		this.a= a;
  	}
  
  	void foo() {
  		System.out.println(this.a.i);
  	}
  }
[A]
    package p;
  
  class A<E> {
      int i;
  }
  
}
