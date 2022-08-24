package dev.armoury.android.widget.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import dev.armoury.android.widget.MessageView
import java.util.Date

internal const val INVALID_VALUE = -1

class MessageModel(
    @MessageView.State val state: Int,
    @DrawableRes var imageRes: Int = INVALID_VALUE,
    @StringRes var titleTextRes: Int = INVALID_VALUE,
    var titleText: String? = null,
    @StringRes var descriptionTextRes: Int = INVALID_VALUE,
    var descriptionText: String? = null,
    @StringRes var buttonTextRes: Int = INVALID_VALUE,
    var buttonText: String? = null,
    var startAt: Date?
) {

    fun reset() {
        imageRes = INVALID_VALUE
        titleTextRes = INVALID_VALUE
        titleText = null
        descriptionTextRes = INVALID_VALUE
        descriptionText = null
        buttonTextRes = INVALID_VALUE
        buttonText = null
        startAt = null
    }

    fun hasTitle() = titleText != null || titleTextRes != INVALID_VALUE

    fun hasDescription() = descriptionText != null || descriptionTextRes != INVALID_VALUE

}