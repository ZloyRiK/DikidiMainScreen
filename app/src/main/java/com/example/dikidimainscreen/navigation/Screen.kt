package com.example.dikidimainscreen.navigation

import com.google.gson.Gson

sealed class Screen(
    val route: String
) {
    object NewsFeed : Screen(ROUTE_NEWS_FEED)
    object Favorite : Screen(ROUTE_FAVORITES)
    object Profile : Screen(ROUTE_PROFILE)

    object Home : Screen(ROUTE_HOME)
    object Comments : Screen(ROUTE_COMMENTS) {

//        const val ROUTE_WITHOUT_ARGS = "comments"
//        fun getRouteWithArgs(feedPost: FeedPost): String {
//            val feedPostJson = Gson().toJson(feedPost)
//            return "$ROUTE_WITHOUT_ARGS/${feedPostJson.encode()}"
//        }
    }

    companion object {

        const val KEY_FEED_POST = "feed_post"

        const val ROUTE_HOME = "home"
        const val ROUTE_COMMENTS = "comments/{$KEY_FEED_POST}"
        const val ROUTE_NEWS_FEED = "news feed"
        const val ROUTE_FAVORITES = "favorite"
        const val ROUTE_PROFILE = "profile"

    }
}