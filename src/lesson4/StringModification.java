/**
 * @author ann
 * @data 25.09.22
 */
package lesson4;

public class StringModification {
    public static String text = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
    public static String splitFrom = "Z";
    public static String splitTo = " ";

    public static void main(String[] args) {

        String[] textAr = splitString(text, splitFrom);
        String reversedText = reverseText(textAr, splitTo);
        System.out.println(reversedText);
    }
    public static String[] splitString(String text, String splitFrom) {
        String[] splittedArText = text.split(splitFrom);
        return splittedArText;
    }
    public static String reverseText(String[] text, String splitTo) {
        String reversedText = "";
        for(String word : text){
            reversedText += new StringBuilder(word).reverse() + splitTo;
        }
        return reversedText.trim();
    }
}
