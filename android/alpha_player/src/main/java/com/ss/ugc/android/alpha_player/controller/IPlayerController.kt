package com.ss.ugc.android.alpha_player.controller

import android.view.View
import android.view.ViewGroup
import com.ss.ugc.android.alpha_player.IMonitor
import com.ss.ugc.android.alpha_player.IPlayerAction
import com.ss.ugc.android.alpha_player.model.DataSource

/**
 * created by dengzhuoyao on 2020/07/07
 */
interface IPlayerController {

    fun start(dataSource: DataSource)

    fun pause()

    fun resume()

    fun stop()

    fun reset()

    fun release()

    fun setVisibility(visibility: Int)

    fun setPlayerAction(playerAction: IPlayerAction)

    fun setMonitor(monitor: IMonitor)

    fun attachAlphaView(parentView: ViewGroup)

    fun detachAlphaView(parentView: ViewGroup)

    fun getView(): View

    fun getPlayerType(): String

    /**
     * Sets the volume of the effect MP4's embedded audio track.
     * Valid range is 0.0 to 1.0.
     */
    fun setVolume(volume: Float)
}