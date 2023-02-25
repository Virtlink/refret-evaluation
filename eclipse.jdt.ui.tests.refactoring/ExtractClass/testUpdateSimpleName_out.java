test;
[p] {
[UpdateSimpleNameParameter]
    package p;
  
  public class UpdateSimpleNameParameter {
  	private int foo;
  	private int foo2;
  	public UpdateSimpleNameParameter() {
  	}
  	public int getFoo() {
  		return foo;
  	}
  	public void setFoo(int foo) {
  		this.foo = foo;
  	}
  	public int getFoo2() {
  		return foo2;
  	}
  	public void setFoo2(int foo2) {
  		this.foo2 = foo2;
  	}
  }
[UpdateSimpleName]
    package p;
  
  public class UpdateSimpleName {
  	private UpdateSimpleNameParameter parameterObject = new UpdateSimpleNameParameter();
  	public void foo() {
  		parameterObject.setFoo(parameterObject.getFoo2());
  		this.parameterObject.setFoo(parameterObject.getFoo2());
  		parameterObject.setFoo(this.parameterObject.getFoo2());
  		parameterObject.setFoo(Math.abs(parameterObject.getFoo()));
  		UpdateSimpleName usn= new UpdateSimpleName();
  		usn.parameterObject.setFoo(usn.parameterObject.getFoo2());
  		usn.parameterObject.setFoo(parameterObject.getFoo());
  		usn.parameterObject.setFoo2(usn.parameterObject.getFoo2() + 1);
  	}
  }
  
}
