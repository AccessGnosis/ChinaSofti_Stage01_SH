/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_06_CalcWordsInPhrase.java
* Copyright 2017-08-10 By Gnosis. Allright reserved.
* Time: ÏÂÎç6:42:41
*/
package com.chinasofti.day21.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Di_06_CalcWordsInPhrase {

	public static void main(String[] args) {
		String str = "please in put you. do do. get put put do 'find'";
		// System.out.println(calcWordsInPhrase(str));
		Map<String, Integer> wordsmap = calcWordsInPhrase(str);
		Iterator<String> i = wordsmap.keySet().iterator();
		while (i.hasNext()) {
			String key = i.next();
			System.out.print(key + ":" + wordsmap.get(key) + " ");
		}
		System.out.println("\n========================================");
		Set<Map.Entry<String, Integer>> es = wordsmap.entrySet();
		for (Map.Entry<String, Integer> e : es) {
			System.out.print(e.getKey() + ":" + e.getValue() + " ");
		}
	}

	public static Map<String, Integer> calcWordsInPhrase(String str) {
		Map<String, Integer> wordsmap = new HashMap<String, Integer>();
		Set<String> wordset = new HashSet<String>();
		List<String> wordlist = new ArrayList<String>();
		String[] strs = str.split(" ");

		for (int i = 0; i < strs.length; ++i) {
			strs[i] = strs[i].replaceAll("[^\\w]", "");
			wordlist.add(strs[i]);
			wordset.add(strs[i]);
		}

		Iterator<String> i = wordset.iterator();
		while (i.hasNext()) {
			String word = i.next();
			for (int j = 0; j < wordlist.size(); ++j) {
				if (word.equals(wordlist.get(j))) {
					if (wordsmap.get(word) == null)
						wordsmap.put(word, 0);
					int count = wordsmap.get(word);
					wordsmap.put(word, ++count);

				}
			}
		}

		return wordsmap;
	}
}
