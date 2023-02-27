test;
[p] {
[A]
    //abstract and make private (do not abstract private accesses)
  package p;
  class A{
  	private int f;
  	void m(){
  		int g= f;
  	}
  	public int [[@1|getF]](){
  		return f;
  	}
  }
  class B{
  	int m(){
  		A a= new A();
  		return [[->1|a.getF]]();
  	}
  }
}
