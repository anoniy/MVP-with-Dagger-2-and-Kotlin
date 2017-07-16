package com.kota.hh.ui.base

interface Presenter<in V : MvpView> {

    fun attachView(mvpView: V)

    fun detachView()
}