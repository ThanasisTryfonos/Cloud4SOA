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

public class Software implements INode {

  public NodeToken f0;

  public NodeToken f1;

  public NodeList f2;

  public NodeToken f3;

  private static final long serialVersionUID = 144L;

  public Software(final NodeToken n0, final NodeToken n1, final NodeList n2, final NodeToken n3) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
  }

  public Software(final NodeList n0) {
    f0 = new NodeToken("software");
    f1 = new NodeToken("{");
    f2 = n0;
    f3 = new NodeToken("}");
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
