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

    public void addNote(String date, Note surname) throws IllegalDateException { // сигнатура метода в задании public void addNote(String date, String lastName). пусть созданием объекта Note из строки занимается метод, а не клиентский код
        try {
            if (entry.containsKey(date)) {
                throw new IllegalDateException("Запись на эту дату невозможна.");
            } else {
                entry.put(date, surname);
            }
        } catch (IllegalDateException e) { //исключение обрабатывается в кэтче, тогда зачем  throws IllegalDateException в сигнатуре?
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
