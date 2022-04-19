package com.ramonmunoz.unionviera.feature_notes.presentation.notes

import com.ramonmunoz.unionviera.feature_notes.domain.model.Note
import com.ramonmunoz.unionviera.feature_notes.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
