package com.example.fragment_part8

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [registerfragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class registerfragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentregis = inflater.inflate(R.layout.fragment_registerfragment, container, false)
        val btnRegister = fragmentregis.findViewById<Button>(R.id.Regis_button)
        val name = fragmentregis.findViewById<EditText>(R.id.name_inp)
        val username = fragmentregis.findViewById<EditText>(R.id.username_inp)
        val password = fragmentregis.findViewById<EditText>(R.id.password_inp)

        btnRegister.setOnClickListener{
            MainActivity.name_obj = name.text.toString()
            MainActivity.username_obj = username.text.toString()
            MainActivity.password_obj = password.text.toString()
            name.setText("")
            username.setText("")
            password.setText("")
            Toast.makeText(activity, "Berhasil Menyimpan data", Toast.LENGTH_SHORT).show()
        }
        return fragmentregis
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment registerfragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            registerfragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}