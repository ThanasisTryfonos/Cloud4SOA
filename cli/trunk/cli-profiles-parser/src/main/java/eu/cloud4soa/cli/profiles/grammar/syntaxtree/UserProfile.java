/*
 *  Copyright 2013 Cloud4SOA, www.cloud4soa.eu
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */


/* Generated by JTB 1.4.4 */
package eu.cloud4soa.cli.profiles.grammar.syntaxtree;

import eu.cloud4soa.cli.profiles.grammar.visitor.*;

public class UserProfile implements INode {

  public NodeChoice f0;

  public NodeToken f1;

  public AccountInfo f2;

  public PersonalInfos f3;

  public NodeToken f4;

  private static final long serialVersionUID = 144L;

  public UserProfile(final NodeChoice n0, final NodeToken n1, final AccountInfo n2, final PersonalInfos n3, final NodeToken n4) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
  }

  public UserProfile(final NodeChoice n0, final AccountInfo n1, final PersonalInfos n2) {
    f0 = n0;
    f1 = new NodeToken("{");
    f2 = n1;
    f3 = n2;
    f4 = new NodeToken("}");
  }

  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu) {
    return vis.visit(this, argu);
  }

  public <R> R accept(final IRetVisitor<R> vis) {
    return vis.visit(this);
  }

  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu) {
    vis.visit(this, argu);
  }

  public void accept(final IVoidVisitor vis) {
    vis.visit(this);
  }

}
