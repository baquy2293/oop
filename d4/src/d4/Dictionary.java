/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d4;

import java.util.ArrayList;

/**
 *
 * @author abc
 */
public class Dictionary {

    ArrayList<Word> words = new ArrayList<>();

    public Dictionary() {
        words.add(new Word(0, "go", "di"));
        words.add(new Word(1, "byte", "tam biet"));
        words.add(new Word(2, "hello", "chao"));
        words.add(new Word(3, "stack", "ngan xep"));
        words.add(new Word(4, "mouse", "chuot"));
        words.add(new Word(5, "pen", "but"));
        words.add(new Word(6, "calculator", "may tinh cam tay"));
        words.add(new Word(7, "hold", "cam"));
        words.add(new Word(8, "book", "sach"));
        words.add(new Word(9, "yes", "dong y"));
        words.add(new Word(10, "no", "khong"));
        System.out.println(words.size());
        sapsep();

    }

//    
    public void add(String en, String vn) {
        words.add(new Word(words.size() + 1, en, vn));
        System.out.println(words.get(words.size() - 1).toString());
        sapsep();

    }

    public void sapsep() {
        for (int i = 0; i < words.size() - 1; i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).getEn().compareToIgnoreCase(words.get(j).getEn()) > 0) {
                    Word w = words.get(i);
                    words.set(i, words.get(j));
                    words.set(j, w);
                }
            }
        }

    }

    public String timkiem(String en) {
        int d;
        if ((d = binnary(0, words.size(), en)) != -1) {
            return words.get(d).getVn();
        }
        return "";
    }

    public int binnary(int l, int r, String x) {
        if (l <= r) {
            int mid = (l + r) / 2;
            if (words.get(mid).getEn().compareTo(x) == 0) {
                return mid;
            }
            if (words.get(mid).getEn().compareTo(x) > 0) {
                return binnary(l, mid - 1, x);
            } else {
                return binnary(mid + 1, r, x);
            }
        }
        return -1;
    }

}
