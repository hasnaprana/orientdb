/* Generated By:JJTree: Do not edit this line. OMatchFilterItem.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.Map;

public class OMatchFilterItem extends SimpleNode {
  protected OExpression         className;
  protected OExpression         classNames;
  protected OIdentifier         alias;
  protected OWhereClause        filter;
  protected OWhereClause        whileCondition;
  protected OArrayRangeSelector depth;
  protected OInteger            maxDepth;
  protected boolean             optional = false;

  public OMatchFilterItem(int id) {
    super(id);
  }

  public OMatchFilterItem(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public void toString(Map<Object, Object> params, StringBuilder builder) {
    if (className != null) {
      builder.append("class: ");
      className.toString(params, builder);
      return;
    }
    if (classNames != null) {
      builder.append("classes: ");
      classNames.toString(params, builder);
      return;
    }

    if (alias != null) {
      builder.append("as: ");
      alias.toString(params, builder);
      return;
    }

    if (maxDepth != null) {
      builder.append("maxdepth: ");
      maxDepth.toString(params, builder);
      return;
    }

    if (filter != null) {
      builder.append("where: (");
      filter.toString(params, builder);
      builder.append(")");
      return;
    }

    if (whileCondition != null) {
      builder.append("while: (");
      whileCondition.toString(params, builder);
      builder.append(")");
      return;
    }

    if(optional){
      builder.append("optional: ");
      builder.append(optional);
      return;
    }
  }
}
/* JavaCC - OriginalChecksum=74bf4765509f102180cac29f2295031e (do not edit this line) */
