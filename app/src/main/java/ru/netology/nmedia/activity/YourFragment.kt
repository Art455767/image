package ru.netology.nmedia.activity

import android.widget.Toast
import androidx.fragment.app.Fragment
import ru.netology.nmedia.R
import ru.netology.nmedia.adapter.OnInteractionListener
import ru.netology.nmedia.ui.ImageViewFragment

class YourFragment : Fragment(), OnInteractionListener {
    override fun onImageClick(imageUrl: String) {
        val fullImageUrl = "http://10.0.2.2:9999/media/$imageUrl"
        val imageViewFragment = ImageViewFragment.newInstance(fullImageUrl)
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, imageViewFragment)
            .addToBackStack(null)
            .commit()
    }
}
