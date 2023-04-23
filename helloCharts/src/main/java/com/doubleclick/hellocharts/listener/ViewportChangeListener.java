package com.doubleclick.hellocharts.listener;

import com.doubleclick.hellocharts.model.Viewport;

/**
 * Use implementations of this listener to be notified when chart viewport changed. For now it works only for preview
 * charts. To make it works for other chart types you just need to uncomment last line in
 * {@link com.doubleclick.hellocharts.animation.ChartComputator#constrainViewport(float, float, float, float)} method.
 */
public interface ViewportChangeListener {

    /**
     * Called when current viewport of chart changed. You should not modify that viewport.
     */
    public void onViewportChanged(Viewport viewport);

}
