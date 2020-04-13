
package com.flaringapp.smadlab5.presentation.activities.impl

import com.flaringapp.smadlab5.presentation.activities.MainContract
import com.flaringapp.smadlab5.presentation.activities.navigation.Screen
import com.flaringapp.smadlab5.presentation.fragments.home.impl.HomeFragment
import com.flaringapp.smadlab5.presentation.mvp.BasePresenter

class MainPresenter: BasePresenter<MainContract.ViewContract>(), MainContract.PresenterContract {

    override fun onNavigate(screen: Screen, data: Any?) {
        val fragment = when(screen) {
            Screen.HOME -> HomeFragment.newInstance()
        }
        view?.openScreen(fragment)
    }
}