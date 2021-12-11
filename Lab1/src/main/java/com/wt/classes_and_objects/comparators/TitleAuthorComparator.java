package com.handen.wt.classes_and_objects.comparators;

import com.handen.wt.classes_and_objects.Book;

import java.util.Comparator;

class TitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int titleComparison = o1.getTitle().compareTo(o2.getTitle());
        if(titleComparison == 0) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        } else {
            return titleComparison;
        }
    }
}
