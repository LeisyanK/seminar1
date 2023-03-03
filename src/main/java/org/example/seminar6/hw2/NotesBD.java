package org.example.seminar6.hw2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotesBD {
    public static void main(String[] args) {
        System.out.println(addNotes());
    }

    public static Map<Integer, Notebook> addNotes() {
        Notebook note1 = new Notebook("Asus", "AS-2", 12, 1024, "Windows10", "красный", 15200.0, false);
        Notebook note2 = new Notebook("hp", "MG-10", 8, 512, "Windows10", "черный", 11500.0, false);
        Notebook note3 = new Notebook("Apple", "NT-25", 16, 1024, "MacOS", "серый", 25000.0, false);
        Notebook note4 = new Notebook("Asus", "AS-2", 12, 1024, "Windows10", "красный", 15200.0, true);
        Notebook note5 = new Notebook("Samsung", "AK-8", 12, 256, "Windows10", "черный", 16600.0, false);
        Notebook note6 = new Notebook("Apple", "AT-20", 16, 1000, "MacOS", "белый", 23000.0, false);
        Notebook note7 = new Notebook("Asus", "AS-3", 16, 1024, "Windows10", "черный", 17300.0, false);
//        List<Notebook> notes = new ArrayList<>();
        Map<Integer, Notebook> notes = new HashMap<>();
        notes.put(1, note1);
        notes.put(2, note2);
        notes.put(3, note3);
        notes.put(4, note4);
        notes.put(5, note5);
        notes.put(6, note6);
        notes.put(7, note7);
        return notes;
    }
}
