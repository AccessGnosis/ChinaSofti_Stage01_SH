/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_01_CalcStrings.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: ÏÂÎç5:50:08
*/
package com.chinasofti.day19.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Di_01_CalcStrings {

	public static void main(String[] args) {
		String str = "fdsafd /*-afaaaabcd489a4f89d+af41a9  f+daf+9a+f48d9a+4f89d4af894d48sf94d89a4f8d94a8f94ds89af04d8sa9f048sd90f498sd0*af-/d8*-f/s*-adf*8-ds85f-0dsa5f0-d58s*a-f85*d-sa8f*-ds8af0123456789";

		Map<String, Integer> result = calcStrings(str);

		Set<String> keys = result.keySet();
		for (Object key : keys) {
			System.out.println(key + "-->" + result.get(key));
		}
	}

	public static Map<String, Integer> calcStrings(String str) {
//		char[] charArgs = new char[26];
//		char[] charArgs = new char[128];
//		for (int i = 0; i < charArgs.length; ++i) {
//			charArgs[i] = (char) (i);
//		}
		Map<String, Integer> result = new HashMap<String, Integer>();
		Set<Character> set = new HashSet<Character>();
		for(int i = 0; i < str.length(); ++i){
			set.add(str.charAt(i));
		}
		Object[] charArgs = set.toArray();
		

		for (int i = 0; i < str.length(); ++i) {
			for (int j = 0; j < charArgs.length; ++j) {
				if (str.charAt(i) == charArgs[j].toString().charAt(0)) {
					if (result.get(charArgs[j] + "") == null)
						result.put(charArgs[j] + "", 0);
					int fore = result.get(charArgs[j] + "");
					result.put(charArgs[j] + "", ++fore);
				}
			}
		}

		return result;
	}
}
