package com.example.solvedacgrass

/**
 * 클래스에 대한 간단한 설명이나 참고 url을 남겨주세요.
 * Created by fac.toriall on 2023.04.02..
 */
sealed class Screen(val route: String) {
    object Splash: Screen(route = "splash")
    object Login: Screen(route = "login")
    object Grass: Screen(route = "grass")
    object Statistics: Screen(route = "statistics")
    object Tip: Screen(route = "tip")
}