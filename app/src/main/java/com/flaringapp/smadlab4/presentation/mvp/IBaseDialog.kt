package com.flaringapp.smadlab4.presentation.mvp

interface IBaseDialog: IBaseView {
    val dialogTag: String?

    fun close()
}