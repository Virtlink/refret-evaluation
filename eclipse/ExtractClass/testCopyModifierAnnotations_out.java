test;
[p] {
[CopyModifierAnnotations]
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
  
  public class CopyModifierAnnotations {
  	public CopyModifierAnnotationsParameter parameterObject = new CopyModifierAnnotationsParameter(7);
  }
[CopyModifierAnnotationsParameter]
    package p;
  
  public class CopyModifierAnnotationsParameter {
  	@Deprecated
  	public final int test;
  	public String test2;
  	public Integer test4;
  	public CopyModifierAnnotationsParameter(int test) {
  		this.test = test;
  	}
  }
}
