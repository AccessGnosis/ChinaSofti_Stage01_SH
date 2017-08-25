/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_07_BoostByDi_06.java
* Copyright 2017-08-10 By Gnosis. Allright reserved.
* Time: ÏÂÎç7:14:01
*/
package com.chinasofti.day21.task05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Di_07_BoostByDi_06 {

	public static void main(String[] args) {
		String str = "please   IN put you. do   do. get put put do";
		Map<String, Integer> wordsmap = new LinkedHashMap<String, Integer>();
		wordsmap = calcWordsInPhrase(str);
		System.out.println(wordsmap);
	}

	public static Map<String, Integer> calcWordsInPhrase(String str) {
		Map<String, Integer> wordsmap = new LinkedHashMap<String, Integer>();
		String[] strs = str.split("\\s+");

		for (int i = 0; i < strs.length; ++i) {
			strs[i] = strs[i].replaceAll("[^\\w]", "");
			if (wordsmap.get(strs[i]) == null)
				wordsmap.put(strs[i], 0);
			int count = wordsmap.get(strs[i]);
			wordsmap.put(strs[i], ++count);
		}

		return wordsmap;
	}
}
