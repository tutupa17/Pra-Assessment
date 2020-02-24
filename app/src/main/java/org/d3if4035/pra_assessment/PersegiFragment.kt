package org.d3if4035.pra_assessment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import org.d3if4035.pra_assessment.databinding.FragmentPersegiPanjangBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentPersegiPanjangBinding>(
            inflater, R.layout.fragment_persegi_panjang, container, false
        )

        binding.btnHitung.setOnClickListener {


//            var luasPersegi = etAlas*etTinggi
//            var kelilingpersegi = 2*(etAlas+etTinggi)
//
//            binding.tvLuas.text = luasPersegi
//            binding.tvKeliling.text = kelilingpersegi
        }
        binding.btnShare.setOnClickListener {

        }
    return binding.root
    }
}

