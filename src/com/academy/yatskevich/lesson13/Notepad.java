package com.academy.yatskevich.lesson13;

import java.util.*;

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
        try {
            if (entry.containsKey(date)) {
                throw new IllegalDateException("Запись на эту дату невозможна.");
            } else {
                entry.put(date, surname);
            }
        } catch (IllegalDateException e) {
            System.out.println(date + " " + e.getMessage());
        }

    }

    public Note getNote(String date) {
        return entry.get(date);
    }

    public List<Note> getAllNotes() {
        return new ArrayList<>(entry.values());
    }
}
