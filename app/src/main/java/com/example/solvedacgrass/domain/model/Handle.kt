package com.example.solvedacgrass.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by fac.toriall on 2023.04.16..
 *
 * "handle": "lucian0910",
 * "bio": "",
 * "badgeId": "anniversary_1st",
 * "backgroundId": "balloon_005",
 * "profileImageUrl": null,
 * "solvedCount": 308,
 * "voteCount": 3,
 * "class": 5,
 * "classDecoration": "none",
 * "rivalCount": 1,
 * "reverseRivalCount": 1,
 * "tier": 17,
 * "rating": 1802,
 * "exp": 15186293,
 * "ratingByProblemsSum": 1457,
 * "ratingByClass": 200,
 * "ratingBySolvedCount": 138,
 * "ratingByVoteCount": 7,
 * "maxStreak": 6,
 * "coins": 0,
 * "stardusts": 1709,
 * "joinedAt": "2021-06-19T00:00:00.000Z",
 * "bannedUntil": "1970-01-01T00:00:00.000Z",
 * "proUntil": "1970-01-01T00:00:00.000Z",
 * "rank": 2577,
 * "isRival": false,
 * "isReverseRival": false
 *
 */
@Serializable
data class Handle(
    val handle: String,
    val bio: String?,
    val badgeId: String?,
    val backgroundId: String?,
    val profileImageUrl: String?,
    val solvedCount: Int,
    val voteCount: Int,
    @SerialName("class") val userClass: Int,
    val classDecoration: String?,
    val rivalCount: Int,
    val reverseRivalCount: Int,
    val tier: Int,
    val rating: Int,
    val exp: Int,
    val ratingByProblemsSum: Int,
    val ratingByClass: Int,
    val ratingBySolvedCount: Int,
    val ratingByVoteCount: Int,
    val maxStreak: Int,
    val coins: Int,
    val stardusts: Int,
    val joinedAt: String,
    val bannedUntil: String,
    val proUntil: String,
    val rank: Int,
    val isRival: Boolean,
    val isReverseRival: Boolean
)
