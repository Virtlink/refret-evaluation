test;
[p] {
[InheritanceUpdateImpl]
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
  
  public class InheritanceUpdateImpl extends InheritanceUpdate{
  	protected String test="Test";
  	public void foo() {
  		System.out.println("Test:"+test+" Super:"+super.test);
  		test2++;
  	}
  }
[InheritanceUpdate]
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
  
  public class InheritanceUpdate {
  	protected String test;
  	protected int test2;
  }
}
