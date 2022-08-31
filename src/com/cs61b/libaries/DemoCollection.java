//package com.cs61b.libaries;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.*;
//
//public class DemoCollection {
//
//    public static List<String> getWords(String fileName) throws IOException {
//        ArrayList<String> words = new ArrayList<>();
//        File file = new File(fileName);
//        Scanner input = new Scanner(file);
//
//
//        while (input.hasNext()) {
//            String word = input.next();
//            words.add(word);
//        }
//        return words;
//
//    }
//
//    public static Set<String> countUniqueWords(List<String> words) {
//        Set<String> wordSet = new HashSet<>(words);
//        return wordSet;
//    }
//
//    public static Map<String, Integer> collectionWordCount(List<String> words, List<String> targets) {
//
//        Map<String, Integer> counts = new HashMap<>();
//
//        for (String t : targets) {
//            counts.put(t, 0);
//        }
//
//        for (String s : words) {
//            if (counts.containsKey(s)) {
//                int oldCount = counts.get(s);
//                counts.put(s, oldCount + 1);
//            }
//        }
//        return counts;
//    }
//
//    public static void main(String[] args) throws IOException {
//        List<String> wordsList = getWords("test.txt");
//        System.out.println(wordsList);
//        int uniqueWords = countUniqueWords(wordsList);
//
//        System.out.println("The file has " + uniqueWords + " unique words.");
//        List<String> targets = new ArrayList<>();
//        collectionWordCount(wordsList);
//
//        System.out.println(targets);
//    }
//}
