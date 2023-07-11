package com.fabianospdev.getcallrec.ui.pages.home

import androidx.lifecycle.ViewModel
import com.fabianospdev.getcallrec.ui.pages.home.widgets.Item
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    val itemsList = mutableListOf<Item>(Item("Item 1"), Item("Item 2"), Item("Item 3"))

}
