package com.academy.yatskevich.lesson7;

import java.io.Serializable;

public class Document implements Printable, Serializable, Comparable, Cloneable {
    public static final long serialVersionUID = 1L;
    private String name;
    private int numberOfPages;
    private boolean relevance = true;

    public Document() {

    }

    public Document(String name, int numberOfPages) {
        setName(name);
        setNumberOfPages(numberOfPages);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Document d = (Document) obj;
        if (this.name == null || d.name == null) {
            return false;
        }
        return this.numberOfPages == d.numberOfPages && this.name.equals(d.name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numberOfPages;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Document{название = " + name +
                ", количество страниц = " + numberOfPages +
                "}";
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Document)) {
            return -1;
        }
        Document doc = (Document) o;
        return this.getNumberOfPages() - doc.getNumberOfPages();
    }

    @Override
    public Document clone() throws CloneNotSupportedException {
        return new Document(this.getName(), this.getNumberOfPages());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isRelevance() {
        return relevance;
    }

    public void setRelevance(boolean relevance) {
        this.relevance = relevance;
    }
}
