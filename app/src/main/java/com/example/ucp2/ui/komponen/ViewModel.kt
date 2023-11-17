package com.example.ucp2.ui.komponen

import androidx.lifecycle.ViewModel
import com.example.ucp2.data.datamhs
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ViewModel: ViewModel() {
    private val _stateUI = MutableStateFlow(datamhs())
    val stateUI: StateFlow<datamhs> = _stateUI.asStateFlow()

    fun setData(ListContact : MutableList<String>) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = ListContact[0],
                nim = ListContact[1],
                konsentrasi = ListContact[2],
                judul = ListContact[3]
            )
        }
    }

    fun setDosenPem1(Dosen1: String) {
        _stateUI.update { stateSaatIni -> stateSaatIni.copy(dospem1 = Dosen1) }
    }

    fun setDosenPem2(Dosen2: String) {
        _stateUI.update { stateSaatIni -> stateSaatIni.copy(dospem2 = Dosen2)}
    }

}