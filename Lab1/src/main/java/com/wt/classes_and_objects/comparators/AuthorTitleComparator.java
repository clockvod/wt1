package com.handen.wt.classes_and_objects.comparators;

import com.handen.wt.classes_and_objects.Book;

import java.util.Comparator;

class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int authorComparison = o1.getAuthor().compareTo(o2.getAuthor());
        if(authorComparison == 0) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
        else {
            return authorComparison;
        }
    }
}
