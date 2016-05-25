package io.bryantcason;

import java.util.regex.*;

public class StringUtils {

    public static String[] parseInToStringArray(String input){
        return input.split("##");
    }

    public static String[] splitStringIntoKeyValuePairs(String input){
        return input.split("[^a-zA-Z0-9\\\\:./]");
    }

    public static String grabKey(String test){
        Matcher matcher = Pattern.compile("^[^:]+\\s*?", Pattern.CASE_INSENSITIVE).matcher(test);
        matcher.find();
        return matcher.group();
    }

    public static String grabValue(String test) throws Error{
        Matcher matcher = Pattern.compile("[^:]*$", Pattern.CASE_INSENSITIVE).matcher(test);
        matcher.find();
        return matcher.group();
    }

    public static String spellingCorrector(String misspelledWord){
        Matcher matcher = Pattern.compile("0", Pattern.CASE_INSENSITIVE).matcher(misspelledWord);
        matcher.find();
        return matcher.replaceAll("");
    }

    public static String normalizeWord(String input){
        return input.toLowerCase();
    }

}
