package com.oceanbrasil.jornada_android_fev22_jetpack_arquitetura.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PersonagensAdapter(val itens: List<Personagem>) : RecyclerView.Adapter<PersonagensAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(item: Personagem) = with(itemView) {
            val tvNome = findViewById<TextView>(R.id.tvNome)
            val ivImagem = findViewById<ImageView>(R.id.ivImagem)

            tvNome.text = item.nome
            Glide.with(this).load(item.imagemUrl).into(ivImagem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val view = layoutInflater.inflate(R.layout.pokemon_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itens[position]
        holder.bindView(item)
    }

    override fun getItemCount(): Int {
        return itens.count()
    }
}
