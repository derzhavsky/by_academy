package by.academy;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    private static char[] chars = "./,\"-?;:\n".toCharArray();
    public static void main(String[] args) throws Exception {
        String str = WarAndPeace.readFileAsString("E:\\projects\\HomeWork5\\Война и мир.txt");
        ReplaceChars.replaceAllChars(str, chars);
        String newStr = ReplaceChars.replaceAllChars(str, chars);
        String[] words = newStr.toLowerCase().split(" ");


        Map<String, Integer> data = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!data.containsKey(words[i])) {
                data.put(words[i], 1);
            } else {
                data.put(words[i], data.get(words[i]) + 1);
            }
        }
        System.out.println(data.get("мир"));


    }
}
