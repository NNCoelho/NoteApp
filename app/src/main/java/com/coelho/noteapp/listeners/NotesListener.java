package com.coelho.noteapp.listeners;

import com.coelho.noteapp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}