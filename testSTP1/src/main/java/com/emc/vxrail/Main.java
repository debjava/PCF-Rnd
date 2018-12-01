package com.emc.vxrail;

import java.util.regex.*;

class Main {
  public static void main(String[] args) {
    String txt = "protocol      spanning-tree     abcd     ";

    String re1 = "(protocol)"; // Variable Name 1
    String re2 = "(\\s+)"; // White Space 1
    String re3 = "(spanning)"; // Variable Name 2
    String re4 = "(-)"; // Any Single Character 1
    String re5 = "(tree)"; // Variable Name 3
    String re6 = "(\\s+)"; // White Space 2
    String re7 = "((?:[a-z][a-z]+))"; // Word 1

    String regEx1 = "(protocol)(\\s+)(spanning)(-)(tree)(\\s+)((?:[a-z][a-z]+))(\\s*)";

    //    Pattern p = Pattern.compile(re1+re2+re3+re4+re5+re6+re7,Pattern.CASE_INSENSITIVE |
    // Pattern.DOTALL);
    Pattern p = Pattern.compile(regEx1, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    Matcher m = p.matcher(txt);
    if (m.matches()) {
      System.out.println("There is a match");
    } else {
      System.out.println("There is no match ...");
    }
  }
}
