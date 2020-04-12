package com.flaringapp.smadlab4.presentation.activities.navigation

interface AppNavigation {

    fun navigateTo(
        screen: Screen,
        data: Any? = null
    )

}