package com.github.andreyasadchy.xtra.model.chat

import com.github.andreyasadchy.xtra.ui.view.chat.emoteQuality

class TwitchEmote(
        override val name: String,
        var begin: Int = 0,
        var end: Int = 0,
        override val type: String? = null,
        override val url: String = "https://static-cdn.jtvnw.net/emoticons/v2/$name/default/dark/${(when (emoteQuality) {"4" -> ("3") "3" -> ("2") "2" -> ("2") else -> ("1")})}.0",
        val setId: String? = null,
        val ownerId: String? = null) : Emote()
