test;
[p] {
[SwitchCase]
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
  
  public class SwitchCase {
  	private static final int TEST2 = 6;
  	public SwitchCaseParameter parameterObject = new SwitchCaseParameter(TEST2);
  	public void foo(){
  		int test=5;
  		switch (test) {
  		case parameterObject.TEST:
  			break;
  		default:
  			break;
  		}
  	}
  }
[SwitchCaseParameter]
    package p;
  
  public class SwitchCaseParameter {
  	public final int TEST;
  	public SwitchCaseParameter(int test) {
  		TEST = test;
  	}
  }
}
