package com.ramonmunoz.unionviera.feature_notes.presentation.notes

import com.ramonmunoz.unionviera.feature_notes.domain.model.Note
import com.ramonmunoz.unionviera.feature_notes.domain.util.NoteOrder
import com.ramonmunoz.unionviera.feature_notes.domain.util.OrderType

data class NotesState(

    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false,
)
