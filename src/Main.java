// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    }
    public static String maskify(String str) {
     StringBuilder maskedWord = new StringBuilder();
     int numberOfLastChar = str.length();

     if ( numberOfLastChar <= 4){
         maskedWord.append(str);

     }else {
         for (int i = 0; i < str.length(); i++) {
             if ( i <str.length()-4){
                 maskedWord.append("#");
             }else {
                 maskedWord.append(str.charAt(i));
             }
         }

     }




        return maskedWord.toString();

            throw new UnsupportedOperationException("Unimplemented");
        }
    }