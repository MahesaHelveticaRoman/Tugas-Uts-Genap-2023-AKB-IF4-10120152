package a10120152_mahesa;

import android.database.Cursor;

import a10120152_mahesa.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

