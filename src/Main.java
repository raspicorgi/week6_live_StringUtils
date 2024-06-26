public class Main {
    public static void main(String[] args) {


        StringUtilsImpl s = new StringUtilsImpl();
        String palindrome = "Lagerregal";
        String word = "Informatikvorlesung";

        String mediumText = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.";
        String longText = "Es gibt im Moment in diese Mannschaft, oh, einige Spieler vergessen ihnen Profi was sie sind. Ich lese nicht sehr viele Zeitungen, aber ich habe gehört viele Situationen. Erstens: wir haben nicht offensiv gespielt. Es gibt keine deutsche Mannschaft spielt offensiv und die Name offensiv wie Bayern.";


        System.out.println("####   " + word + " in reverse is " + s.reverseString(word));
        System.out.println("####   " + palindrome + " in reverse is " + s.reverseString(palindrome));

        System.out.println("#### uppercase:");
        System.out.println(s.toUpperCase(word));
        System.out.println("#### lowercase:");
        System.out.println(s.toLowerCase(word));

        System.out.println("#### check if longText contains 'Mannschaft':");
        System.out.println(s.containsSubstring(longText, "Mannschaft") ? "yes" : "no");

        System.out.println("#### split text at whitespace, join with underscore:");
        System.out.println(s.joinStrings(s.splitString(longText, ' '), '_'));
        String[] a = new String[]{"Wort1", "Wort2"};
        System.out.println(s.joinStrings(a, ' '));

        System.out.println("#### check if " + palindrome + " is a palindrome:");
        System.out.println(s.isPalindrome(s.toLowerCase(palindrome)) ? "yes" : "no");
        System.out.println("check if silent and listen are anagrams:");
        System.out.println(s.areAnagrams("silent", "listen") ? "yes" : "no");
        
        System.out.println("#### remove whitespaces of mediumText:");
        System.out.println(s.removeWhitespaces(mediumText));
        System.out.println("#### capitalize text:");
        System.out.println(s.capitalizeFirstLetter(s.toLowerCase(mediumText)));

    }
}

//hey