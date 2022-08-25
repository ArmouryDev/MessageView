package dev.armoury.android.widget.data

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import dev.armoury.android.widget.MessageView

internal const val INVALID_VALUE = -1

class MessageModel(
    @MessageView.State var state: Int,
    @DrawableRes var imageRes: Int = INVALID_VALUE,
    @StringRes var titleTextRes: Int = INVALID_VALUE,
    var titleText: String? = null,
    @StringRes var descriptionTextRes: Int = INVALID_VALUE,
    var descriptionText: String? = null,
    @StringRes var buttonTextRes: Int = INVALID_VALUE,
    var buttonText: String? = null,
    @ColorRes
    var buttonColor: Int = INVALID_VALUE,
    var remainedTime : Long = 0
) {

    fun reset() {
        imageRes = INVALID_VALUE
        titleTextRes = INVALID_VALUE
        titleText = null
        descriptionTextRes = INVALID_VALUE
        descriptionText = null
        buttonTextRes = INVALID_VALUE
        buttonText = null
        buttonColor = INVALID_VALUE
        remainedTime = 0
    }

    fun hasTitle() = titleText != null || titleTextRes != INVALID_VALUE

    fun hasDescription() = descriptionText != null || descriptionTextRes != INVALID_VALUE

}