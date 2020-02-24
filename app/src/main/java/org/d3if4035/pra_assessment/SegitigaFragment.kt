package org.d3if4035.pra_assessment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import org.d3if4035.pra_assessment.databinding.FragmentSegitigaBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSegitigaBinding>(
            inflater, R.layout.fragment_segitiga, container, false
        )
        binding.btnHitung.setOnClickListener {
//            var luasSegitiga = etAlas * etTinggi
//            var kelilingSegitiga = 2 * (etAlas + etTinggi)
//
//            binding.tvLuas.text = luasSegitiga
//            binding.tvKeliling.text = kelilingSegitiga
        }

        binding.btnShare.setOnClickListener{

        }
        return binding.root
    }
}
