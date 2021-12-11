package com.handen.wt.classes_and_objects.comparators;

import com.handen.wt.classes_and_objects.Book;

import java.util.Comparator;

class AuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int authorComparison = o1.getAuthor().compareTo(o2.getAuthor());
        if(authorComparison == 0) {
            int titleComparison = o1.getTitle().compareTo(o2.getTitle());
            if(titleComparison == 0) {
                if(o1.getPrice() > o2.getPrice()) {
                    return 1;
                }
                else {
                    if(o1.getPrice() < o2.getPrice()) {
                        return -1;
                    }
                    return 0;
                }
            }
            else {
                return titleComparison;
            }
        }
        else {
            return authorComparison;
        }
    }
}
