test;
[p] {
[ComplexExtractGetterSetterParameter]
    package p;
  
  public class ComplexExtractGetterSetterParameter {
  	private int test;
  	private int test2;
  	private int test3;
  	private int test4;
  	public ComplexExtractGetterSetterParameter(int test2, int test4) {
  		this.test2 = test2;
  		this.test4 = test4;
  	}
  	public int getTest() {
  		return test;
  	}
  	public void setTest(int test) {
  		this.test = test;
  	}
  	public int getTest2() {
  		return test2;
  	}
  	public void setTest2(int test2) {
  		this.test2 = test2;
  	}
  	public int getTest3() {
  		return test3;
  	}
  	public void setTest3(int test3) {
  		this.test3 = test3;
  	}
  	public int getTest4() {
  		return test4;
  	}
  	public void setTest4(int test4) {
  		this.test4 = test4;
  	}
  }
[ComplexExtractGetterSetter]
    /*******************************************************************************
   * Copyright (c) 2007 IBM Corporation and others.
   *
   * This program and the accompanying materials
   * are made available under the terms of the Eclipse Public License 2.0
   * which accompanies this distribution, and is available at
   * https://www.eclipse.org/legal/epl-2.0/
   *
   * SPDX-License-Identifier: EPL-2.0
   *
   * Contributors:
   *     IBM Corporation - initial API and implementation
   *******************************************************************************/
  package p;
  
  public class ComplexExtractGetterSetter {
  	protected ComplexExtractGetterSetterParameter parameterObject = new ComplexExtractGetterSetterParameter(5, 5);
  
  	public void foo(){
  		parameterObject.setTest3(parameterObject.getTest3() + 1);
  		parameterObject.setTest(5+7);
  		System.out.println(parameterObject.getTest()+" "+parameterObject.getTest4());
  	}
  }
}
