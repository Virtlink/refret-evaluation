test;
[p] {
[A]
    //rename to j
  package p;
  class A{
  	int k;
  	void m(){
  		int /*[*/i/*]*/= 0;
  		A a= new A(){
  			void m(int i){
  				i++;
  			}
  		};
  	}
  }
}
