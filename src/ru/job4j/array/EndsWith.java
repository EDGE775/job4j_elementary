package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        int lengthPost = post.length;
        for (int i = 0; i < lengthPost; i++) {
            int indexPost = lengthPost - 1 - i;
            int indexWord = word.length - 1 - i;
            if (word[indexWord] != post[indexPost]) {
                return false;
            }
        }
        return true;
    }
}
