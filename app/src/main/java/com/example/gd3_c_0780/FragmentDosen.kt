package com.example.gd3_c_0780

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gd3_c_0780.entity.Dosen
import com.example.gd3_c_0780.entity.Mahasiswa


class FragmentDosen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Proses menghubungkan layout fragment_mahasiswa.xml dengan fragment ini
        return inflater.inflate(R.layout.fragment_dosen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        val adapter: RVDosenAdapter = RVDosenAdapter(Dosen.listOfDosen)

        // Menghubungkan rvMahasiswa dengan recycler view yang ada pada layout
        val rvDosen: RecyclerView = view.findViewById(R.id.rv_dosen)

        // Set Layout Manager dari Recycler view
        rvDosen.layoutManager = layoutManager

        // tidak mengubah size recycler view jika terdeteksi item ditambahakan atau dikurangkan
        rvDosen.setHasFixedSize(true)

        // Set adapter dari recycler view
        rvDosen.adapter = adapter
    }
}