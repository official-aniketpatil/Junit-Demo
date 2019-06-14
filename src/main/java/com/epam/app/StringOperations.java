package com.epam.app;

public class StringOperations {
	
	public String swapChar(String str){
		  int length=str.length();
		  if(length==0 || length==1) {
			  return str;
		  }
		  StringBuilder sb=new StringBuilder(str.substring(length-2));
		  return str.substring(0,length-2)+sb.reverse().toString();
	  }
	public String removeA(String str) {
       if(str.charAt(0)=='A' && str.charAt(1)=='A' ) {
    	   return str.substring(2);
       }else if(str.charAt(0)=='A') {
    	   return str.substring(1);
       }else if(str.charAt(1)=='A') {
    	   return str.charAt(0)+str.substring(2);
       }
       return str;
	}
}
