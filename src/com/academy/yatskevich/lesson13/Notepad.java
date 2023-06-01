package com.academy.yatskevich.lesson13;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notepad {
    Map<String, Note> entry = new HashMap<>();

    public class Note {
        String surname;

        public Note(String surname) {
            this.surname = surname;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String toString() {
            return surname;
        }
    }

    public void addNote(String date, Note surname) throws IllegalDateException {
        if (entry.containsKey(date)) {
            throw new IllegalDateException("Запись на эту дату невозможна.");
        } else {
            entry.put(date, surname);
        }
    }

    public Note getNote(String date) {
        return entry.get(date);
    }

    public Collection<Note> getAllNotes() { //is List<> type of collection necessary?

        return entry.values();
    }
}
