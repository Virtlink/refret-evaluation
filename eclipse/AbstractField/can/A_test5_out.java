test;
[p] {
[A]
    //abstract and make private
  package p;
  class A{
  	private int [[@4|f]];
  	void m(){
  		[[->2|setF]]([[->1|getF]]());
  	}
  	public int [[@1|getF]](){
  		return f;
  	}
  	public void [[@2|setF]](int [[@3|f]]){
  		[[->4|this.f]]= [[->3|f]];
  	}
  }
  class B{
  	int m(){
  		A a= new A();
  		[[->2|a.setF]]([[->1|a.getF]]());
  		return [[->1|a.getF]]();
  	}
  }
}
