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

import eu.cloud4soa.cli.profiles.grammar.visitor.IRetArguVisitor;
import eu.cloud4soa.cli.profiles.grammar.visitor.IRetVisitor;
import eu.cloud4soa.cli.profiles.grammar.visitor.IVoidArguVisitor;
import eu.cloud4soa.cli.profiles.grammar.visitor.IVoidVisitor;

public class NodeChoice implements INode {

  public INode choice;

  public int which;

  public int total;

  private static final long serialVersionUID = 144L;

  public NodeChoice(final INode node) {
   this(node, -1, -1);
  }

  public NodeChoice(final INode node, final int whichChoice, final int totalChoices) {
    choice = node;
    which = whichChoice;
    total = totalChoices;
  }

  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu) {
    return choice.accept(vis, argu);
  }

  public <R> R accept(final IRetVisitor<R> vis) {
    return choice.accept(vis);
  }

  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu) {
    choice.accept(vis, argu);
  }

  public void accept(final IVoidVisitor vis) {
    choice.accept(vis);
  }

}
