package com.benjamin.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.benjamin.contacts.databinding.ContactItemBinding

class ContactAdapter(val contactList: List<ContactModel>) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
    class ContactViewHolder(val binding: ContactItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

            fun bind(contact :ContactModel){
                binding.firstName.text = contact.firstName
                binding.lastName.text = contact.lastName

                if (contact.isMale){
                    binding.imageView.setImageResource(R.drawable.ic_person)
                }else{
                    binding.imageView.setImageResource(R.drawable.ic_rowing)
                }
            }

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding: ContactItemBinding = ContactItemBinding.inflate(LayoutInflater.from(parent.context))
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contactList.get(position)
        holder.bind(contact)
    }

    override fun getItemCount()= contactList.size
    }

