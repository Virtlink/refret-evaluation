test;
[p] {
[A]
    //renaming A.m to k 
  package p;
  
  class A{
  	void k(){}
  }
  class B{
  	{
  		new A().k();
  	}
  }
}
