package com.bodyrocks.util;

public class StringsUtil {
	public static String replaceCharInString(String inputString,String expression,String replacedExpression){
		return  inputString.replaceAll(expression, replacedExpression);
	}

}
