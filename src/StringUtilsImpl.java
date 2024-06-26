import java.util.Arrays;

public class StringUtilsImpl implements StringUtils {

    private String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lower = "abcdefghijklmnopqrstuvwxyz";

    private char invertUpperLower(char letter){
        String letterAsChar = "" + letter;
        if(upper.contains(letterAsChar)){
            return lower.charAt(upper.indexOf(letter));
        } else {
            return upper.charAt(lower.indexOf(letter));
        }
    }

    // letzte Reihe
    @Override
    public String reverseString(String input) {
        String result = "";
        for(int i = (input.length() - 1); i >= 0; i--) {
            char boio = input.charAt(i);
            String s = "" + boio;
            String[] midmidres = {result, s};
            String midres = joinStrings(midmidres, '\0');
            result = midres;
        }
        return result;
    }

    @Override
    public int countVowels(String input) {
        String criteria = "aeiouAEIOU";
        int counter = 0;
        for(int i = 0; i < input.length(); i++){
            char boii = input.charAt(i);
            String compare = "" + boii;
            if (containsSubstring(criteria, compare)){
                counter++;
            }
        }
        return counter;
    }



    @Override
    public String toUpperCase(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char boie = input.charAt(i);
            String compare = "" + boie;
            if (containsSubstring(upper, compare)){
                result = result + compare;
            } else {
                result = result + invertUpperLower(boie);
            }
        }
        return result;
    }

    @Override
    public String toLowerCase(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char boia = input.charAt(i);
            String compare = "" + boia;
            if (containsSubstring(lower, compare)){
                result = result + compare;
            } else {
                result = result + invertUpperLower(boia);
            }
        }
        return result;
    }


    // mittlere Reihe
    @Override
    public boolean containsSubstring(String input, String substring) {
        if(input == null || substring == null) return false;

        char[] input_arr = input.toCharArray();
        char[] substring_arr = substring.toCharArray();
        if (substring_arr.length==0) return true;
        if (input_arr.length == 0) return false;

        for(int i = 0; i < input_arr.length; i++){
            if (input_arr[i]==substring_arr[0] && input_arr.length-i>=substring_arr.length) {
                for (int j = i; j<substring_arr.length+i; j++) {
                    if (input_arr[j] != substring_arr[j - i]) {
                        break;
                    } else {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    @Override
    public String[] splitString(String input, char delimiter) {
        return input.split(String.valueOf(delimiter));
//        if (input.isEmpty()) {
//            return new String[0];
//            int j = 0;
//        } else {
//            char[] arr = input.toCharArray();
//            for (int i = 1; i <= arr.length; i++) {
//                char[] arr2 = new char[arr.length];
//
//                if(arr[i] != delimiter) {
//                    String word = word + arr2[i];
//                            arra2 [j] == word;
//                }
//                { j = j + 1;
//                    word =
//                }
//
//
//
//
//
//
//                }
//
//            }
//    
//        }
//
    }

    @Override
    public String joinStrings(String[] strings, char delimiter) {
        if(strings.length == 0){
            return "";
        }else {
            String result = "";
            for (int i = 0; i < strings.length; i++) {
                result = result + strings[i] + delimiter;
                if(i == strings.length - 1){
                    result = result;
                }
            }
            return result;
        }
    }

    @Override
    public boolean isPalindrome(String input) {
        int l = input.length();
        char[] newinput = new char[l];
        char[] reverse = new char[l];
        for(int a=0; a<l; a++){
            newinput[a] = input.charAt(a);
        }
        for(int b=0; b<l; b++){
            reverse[b] = input.charAt(l-1-b);
        }
        return Arrays.equals(reverse, newinput);
    }


    // vordere Reihe
    @Override
    public boolean areAnagrams(String string1, String string2) {
        char[] StringArray = string2.toCharArray();

        if (string1.length() == string2.length()) {
            for (int i = 0; i < string1.length(); i++) {
                for (int j = 0; j < string1.length(); j++) {
                    if (string1.charAt(i) == string2.charAt(j)) {
                        StringArray[j] = 1;
                        break;
                    }
                }
            }
            for (int i = 0; i < string2.length(); i++) {
                if (string2.charAt(i) != 1) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    @Override
    public String removeWhitespaces(String input) {
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                output += input.charAt(i);
            }
        }
        return output;
    }

    @Override
    public String capitalizeFirstLetter(String input) {
        String output = "";
        String capital = input.toUpperCase();
        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                output += capital.charAt(0);
            } else {
                output += input.charAt(i);
            }
        }
        return output;
    }
}
