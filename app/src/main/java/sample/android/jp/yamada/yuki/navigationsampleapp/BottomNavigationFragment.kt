package sample.android.jp.yamada.yuki.navigationsampleapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class BottomNavigationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        val safeArgs = BottomNavigationFragmentArgs.fromBundle(arguments)

        return when (safeArgs.pageNumber) {
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

        view.findViewById<View>(R.id.button).setOnClickListener {
            //            Navigation.createNavigateOnClickListener(R.id.next_action)
        }
    }
}