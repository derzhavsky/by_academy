package by.academy;

public class ReplaceChars {

    public static String replaceAllChars(String str, char[] chars) {
        for (char aChar : chars) {
            while (str.indexOf(aChar) > -1) {
                str = str.replace(String.valueOf(aChar), "");
            }
        }
        return str;
    }
}
