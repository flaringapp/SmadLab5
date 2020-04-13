package com.flaringapp.smadlab5.presentation.mvp

interface IBaseDialog: IBaseView {
    val dialogTag: String?

    fun close()
}