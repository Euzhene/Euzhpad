package com.euzhene.euzhpad.domain.usecase

import androidx.lifecycle.LiveData
import com.euzhene.euzhpad.domain.entity.NoteItem
import com.euzhene.euzhpad.domain.repository.NoteListRepository
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class GetNoteListUseCase @Inject constructor(private val repository: NoteListRepository) {
    operator fun invoke(): LiveData<List<NoteItem>> {
        return repository.getNoteList()
    }
}