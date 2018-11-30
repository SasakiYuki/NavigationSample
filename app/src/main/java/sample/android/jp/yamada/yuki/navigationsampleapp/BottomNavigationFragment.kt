package sample.android.jp.yamada.yuki.navigationsampleapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class BottomNavigationFragment : Fragment() {
    private val pageNumber: Int by lazy {
        val safeArgs = BottomNavigationFragmentArgs.fromBundle(arguments)
        return@lazy safeArgs.pageNumber
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)

        return when (pageNumber) {
            1 -> inflater.inflate(R.layout.fragment_bottom_navigation_1, container, false)
            2 -> inflater.inflate(R.layout.fragment_bottom_navigation_2, container, false)
            3 -> inflater.inflate(R.layout.fragment_bottom_navigation_3, container, false)
            4 -> inflater.inflate(R.layout.fragment_bottom_navigation_4, container, false)
            5 -> inflater.inflate(R.layout.fragment_bottom_navigation_5, container, false)
            else -> inflater.inflate(R.layout.fragment_bottom_navigation_1, container, false)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        when (pageNumber) {
            3 -> setupButtonClickListener(view)
        }
    }

    private fun setupButtonClickListener(view: View) {
        view.findViewById<View>(R.id.button).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.setting_activity)
        }
    }
}