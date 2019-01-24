package pl.gmat.motionlayoutsample

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

private const val PAGES_COUNT = 3

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int) = PhotosFragment()

    override fun getCount() = PAGES_COUNT

    override fun getPageTitle(position: Int) = "Gallery #${position + 1}"
}