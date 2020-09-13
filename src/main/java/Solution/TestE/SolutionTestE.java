package Solution.TestE;

public class SolutionTestE {
    public String mask(String original) {
        StringBuilder builder = new StringBuilder();
        String[] word = original.split(" ");
        for (String obj : word) {
            if (obj.length() == 2) {
                builder.append(obj);
            } else {
                String newWord = replaceWord(obj, '*');
                builder.append(newWord);
            }
            builder.append(" ");
        }

        String result = builder.toString();
        return result.substring(0, result.length() - 1);
    }

    public static String replaceWord(String word, char replacer) {
        StringBuilder builder = new StringBuilder();
        if (word.length() > 2) {
            builder.append(word.charAt(0));
            for (int i = 1; i < word.length() - 1; i++) {
                builder.append(replacer);
            }
            builder.append(word.charAt(word.length() - 1));
            return builder.toString();
        }

        return word;
    }
}
