package com.example.recyclerview_bio

import androidx.lifecycle.ViewModel
import com.example.livedatarecyclerview.DataModel

class DataViewModel : ViewModel() {

    private var listOfPerson = mutableListOf<DataModel>()

    init {
        listOfPerson.add(DataModel(R.drawable.photo012, "Fadila Kharisma Yoga", "225150209111007", "A"))
        listOfPerson.add(DataModel(R.drawable.photo014, "Denny Prastyo I.", "225150209111014", "B"))
        listOfPerson.add(DataModel(R.drawable.photo015, "Kharisma Aryawitama", "225150209111004", "E"))
    }

    fun dataList(): MutableList<DataModel> {
        return listOfPerson
    }


}
