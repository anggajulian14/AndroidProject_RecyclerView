package com.example.projectlistrecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MahasiswaAdapter
    private lateinit var mahasiswaArrayList: ArrayList<Mahasiswa>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addData()

        recyclerView = findViewById(R.id.recycler_view)
        adapter = MahasiswaAdapter(mahasiswaArrayList)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    private fun addData() {
        mahasiswaArrayList = ArrayList()
        mahasiswaArrayList.add(Mahasiswa("Dimas Maulana", "1414370309", "123456789"))
        mahasiswaArrayList.add(Mahasiswa("Fadly Yonk", "1214234560", "987654321"))
        mahasiswaArrayList.add(Mahasiswa("Ariyandi Nugraha", "1214230345", "987648765"))
        mahasiswaArrayList.add(Mahasiswa("Aham Siswana", "1214378098", "098758124"))
        mahasiswaArrayList.add(Mahasiswa("Rahmat Kopling", "8383838383", "98903803980"))
        mahasiswaArrayList.add(Mahasiswa("Budi Santoso", "1214398743", "123456789"))
        mahasiswaArrayList.add(Mahasiswa("Siti Fatimah", "1314370456", "987654321"))
        mahasiswaArrayList.add(Mahasiswa("Ahmad Rifai", "1414230123", "987648765"))
        mahasiswaArrayList.add(Mahasiswa("Indah Wulandari", "1514378090", "098758124"))
        mahasiswaArrayList.add(Mahasiswa("Agus Setiawan", "1214378088", "98903803980"))
        mahasiswaArrayList.add(Mahasiswa("Wulan Kusuma", "1214378990", "123456789"))
        mahasiswaArrayList.add(Mahasiswa("Dina Fitriani", "1214378099", "987654321"))
        mahasiswaArrayList.add(Mahasiswa("Farhan Rizki", "1214378011", "987648765"))
        mahasiswaArrayList.add(Mahasiswa("Rina Agustina", "1214378022", "098758124"))
        mahasiswaArrayList.add(Mahasiswa("Ahmad Fauzi", "1214378033", "98903803980"))
        mahasiswaArrayList.add(Mahasiswa("Sari Dewi", "1214378044", "123456789"))
        mahasiswaArrayList.add(Mahasiswa("Dewi Lestari", "1214378055", "987654321"))
        mahasiswaArrayList.add(Mahasiswa("Eka Putri", "1214378066", "987648765"))
        mahasiswaArrayList.add(Mahasiswa("Rudi Setiawan", "1214378077", "098758124"))
        mahasiswaArrayList.add(Mahasiswa("Siti Rahayu", "1214378088", "98903803980"))
        mahasiswaArrayList.add(Mahasiswa("Wahyu Pratama", "1214378099", "123456789"))
        mahasiswaArrayList.add(Mahasiswa("Nurul Huda", "1214378110", "987654321"))
        mahasiswaArrayList.add(Mahasiswa("Yuli Kurnia", "1214378121", "987648765"))
        mahasiswaArrayList.add(Mahasiswa("Iqbal Ramadhan", "1214378132", "098758124"))
        mahasiswaArrayList.add(Mahasiswa("Dina Amalia", "1214378143", "98903803980"))
    }

}