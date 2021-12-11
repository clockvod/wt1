package com.handen.wt.classes_and_objects;

class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object other) {
        if(this == other) return true;
        if(getClass() != other.getClass()) return false;
        ProgrammerBook book = (ProgrammerBook) other;
        return level == book.level && language.equals(book.language);
    }

    @Override
    public int hashCode() {
        return 31 * (language.hashCode() + level + super.hashCode());
    }

    @Override
    public String toString() {
        return "ProgrammerBook{language='" + language + "\', level=" + level + '}';
    }
}
