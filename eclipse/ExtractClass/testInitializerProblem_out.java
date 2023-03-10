test;
[p] {
[InitializerProblemParameter]
    package p;
  
  import java.util.ArrayList;
  
  public class InitializerProblemParameter {
  	public int test;
  	public int test2 = test;
  	public ArrayList list;
  	public InitializerProblemParameter(int test, ArrayList list) {
  		this.test = test;
  		this.list = list;
  	}
  }
[InitializerProblem]
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
  
  import java.util.ArrayList;
  
  class A {
  	public int foo() {
  		return 5;
  	}
  }
  
  public class InitializerProblem extends A{
  	public InitializerProblemParameter parameterObject = new InitializerProblemParameter(foo(), new ArrayList());
  }
}
