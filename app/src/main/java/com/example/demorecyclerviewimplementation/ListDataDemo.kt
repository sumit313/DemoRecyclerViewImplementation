package com.example.demorecyclerviewimplementation

data class ListDataDemo(val text: String)
    object  DataSource{
        val dataList = listOf<ListDataDemo>(
            ListDataDemo("Ram"),
            ListDataDemo("Shyam"),
            ListDataDemo("Aman"),
            ListDataDemo("Alena"),
            ListDataDemo("Zac"),
            ListDataDemo("Sam"),
            ListDataDemo("xoxo"),
            ListDataDemo("Antivirus"),
            ListDataDemo("Player"),
            ListDataDemo("Chamiya"),
            ListDataDemo("Ajay")
        )

        val newDataList = listOf<ListDataDemo>(
            ListDataDemo("Ram Singh"),
            ListDataDemo("Shyam"),
            ListDataDemo("Aman"),
            ListDataDemo("Alena"),
            ListDataDemo("Riyuk"),
            ListDataDemo("Sam"),
            ListDataDemo("xoxo"),
            ListDataDemo("Antivirus"),
            ListDataDemo("Player313"),
            ListDataDemo("Chamiya"),
            ListDataDemo("Ajay Alok")
        )
    }