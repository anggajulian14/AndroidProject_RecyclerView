package com.example.projectlistrecycle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MahasiswaAdapter(private val dataList: ArrayList<Mahasiswa>) :
    RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahasiswaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.list_item, parent, false)
        return MahasiswaViewHolder(view)
    }

    override fun onBindViewHolder(holder: MahasiswaViewHolder, position: Int) {
        holder.txtNama.text = dataList[position].nama
        holder.txtNim.text = dataList[position].npm
        holder.noHp.text = dataList[position].nohp
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class MahasiswaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtNama: TextView = itemView.findViewById(R.id.txt_nama_mahasiswa)
        var txtNim: TextView = itemView.findViewById(R.id.txt_npm_mahasiswa)
        var noHp: TextView = itemView.findViewById(R.id.txt_nohp_mahasiswa)
    }
}

