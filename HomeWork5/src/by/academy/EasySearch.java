package by.academy;

public class EasySearch implements ISearchEngine {


    @Override
    public int search(String[] text, String word) {
        int count = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i].equals(word))
                count++;
        }
        return count;
    }

    public int searchStr(String str, String word) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(word, i) > 0) {
                count++;
                i = str.indexOf(word, i) + 1;
            }
        }
        return count;
    }


}
