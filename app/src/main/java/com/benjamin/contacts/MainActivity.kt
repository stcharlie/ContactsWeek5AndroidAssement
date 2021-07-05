package com.benjamin.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.benjamin.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myContactAdapter: ContactAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contactList: List<ContactModel> = listOf(
            ContactModel(
                "Akarekor", "Charles", true
            ),
            ContactModel(
                "Ben", "Ruth", false
            ),
            ContactModel(
                "Taylor", "Swift", false
            ),
            ContactModel(
                "Ben", "Charles", true
            ),
            ContactModel(
                "John", "Doe", true
            ),
            ContactModel(
                "Jack", "Grealish", true
            ),
            ContactModel(
                "Mount", "Mason", true
            ),
            ContactModel(
                "Tom", "Braidy", true
            ),
            ContactModel(
                "Timo", "Wearner", true
            ),
            ContactModel(
                "Kia", "Harvertz", true
            ),
            ContactModel(
                "Toni", "Rudiger", true
            ),
            ContactModel(
                "Alex", "Pato", true
            ),
            ContactModel(
                "Tammy", "Abraham", true
            ),
            ContactModel(
                "James", "Reece", true
            ),
            ContactModel(
                "Ngolo", "Kante", true
            ),
            ContactModel(
                "Billy", "Gilmore", true
            ),
            ContactModel(
                "Calvin", "Kline", true
            ),
            ContactModel(
                "Clyde", "Bonny", true
            ),
            ContactModel(
                "Tom", "Hardy", true
            ),
            ContactModel(
                "Owen", "Wilson", true)
        )
        myContactAdapter = ContactAdapter(contactList)
        binding.recycler.adapter =myContactAdapter
    }

}



