test;
[p] {
[A]
    //no ref update
  //renaming A.m to k 
  package p;
  
  class A{
  	void m(){
  		this.m();
  	}
  }
}
