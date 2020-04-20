package by.academy;

public class Main {
    private static char[] chars = "./,\"-?;:\n".toCharArray();

    public static void main(String[] args) throws Exception {

        String data = WarAndPeace.readFileAsString("E:\\projects\\HomeWork5\\Война и мир.txt");
        ReplaceChars replaceChars = new ReplaceChars();
        String newData = replaceChars.replaceAllChars(data, chars).toLowerCase();

        String[] text = newData.split(" ");


        EasySearch search = new EasySearch();
        System.out.println("война встречается " + search.search(text, "война") + " раз");
        System.out.println("и встречается " + search.search(text, "и") + " раз");
        System.out.println("мир встречается " + search.search(text, "мир") + " раз");
        System.out.println();
        System.out.println(search.searchStr(newData, " война "));
        System.out.println(search.searchStr(newData, " и "));
        System.out.println(search.searchStr(newData, " мир "));
    }

}

