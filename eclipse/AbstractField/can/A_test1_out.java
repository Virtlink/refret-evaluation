test;
[p] {
[A]
    package p;
  class A{
  	private int [[@1|f]];
  	void m(){
  		setF(3);
  	}
  	private void setF(int [[@2|f]]){
  		[[->1|this.f]]= [[->2|f]];
  	}
  }
}
