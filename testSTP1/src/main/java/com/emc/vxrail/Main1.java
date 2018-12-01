package com.emc.vxrail;

import java.util.regex.*;

public class Main1 {
  public static void main(String[] args) {
    String txt = "protocol    spanning-tree     rstp";
    String re1 = "((?:[a-z][a-z]+))"; // Word 1
    String re2 = "(\\s+)"; // White Space 1
    String re3 = "((?:[a-z][a-z]+))"; // Word 2
    String re4 = "(-)"; // Any Single Character 1
    String re5 = "((?:[a-z][a-z]+))"; // Word 3
    String re6 = "(\\s+)"; // White Space 2
    String re7 = "(rstp)"; // Variable Name 1

    String regEx = "((?:[a-z][a-z]+))(\\s+)((?:[a-z][a-z]+))(-)((?:[a-z][a-z]+))(\\s+)((?:[a-z][a-z]+))";

    Pattern p =
        Pattern.compile(
            re1 + re2 + re3 + re4 + re5 + re6 + re7, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    Matcher m = p.matcher(txt);
    if( m.matches()) {
      System.out.println("There is a match");
    }
    else {
      System.out.println("There is no match ...");
    }

  }
}
