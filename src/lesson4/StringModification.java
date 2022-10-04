/**
 * @author ann
 * @data 25.09.22
 */
package lesson4;
public class StringModification {
    public static void main(String[] args) {
        String text = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";

        for(String word : text.split("Z")){
            System.out.print(new StringBuilder(word).reverse() + " ");
        }
    }
}
