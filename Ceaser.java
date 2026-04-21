package Cryptography;
public class Ceaser {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String ptext, int cserkey) {
        ptext = ptext.toLowerCase();
        String ctext = "";
        for (int i = 0; i < ptext.length(); i++) {
            char currentChar = ptext.charAt(i);
            int plainnumeric = ALPHABET.indexOf(currentChar);
            if (plainnumeric != -1) {
                int ciphernumeric = (plainnumeric + cserkey) % 26;
                char cipherchar = ALPHABET.charAt(ciphernumeric);
                ctext += cipherchar;
            } 
            // Ignore spaces
            else if (currentChar != ' ') {
                ctext += currentChar; // Keep other non-space, non-letter characters
            }
        }
        return ctext;
    }

    public static String decrypt(String ctext, int cserkey) {
        ctext = ctext.toLowerCase();
        String ptext = "";

        for (int i = 0; i < ctext.length(); i++) {
            char currentChar = ctext.charAt(i);
            int ciphernumeric = ALPHABET.indexOf(currentChar);
            if (ciphernumeric != -1) {
                int plainnumeric = (ciphernumeric - cserkey) % 26;
                if (plainnumeric < 0) {
                    plainnumeric += ALPHABET.length();
                }
                char plainchar = ALPHABET.charAt(plainnumeric);
                ptext += plainchar;
            } 
            // Ignore spaces
            else if (currentChar != ' ') {
                ptext += currentChar; // Keep other non-space, non-letter characters
            }
        }
        return ptext;
    }
}
