package com.doubleclick.hellocharts.formatter;

import com.doubleclick.hellocharts.model.BubbleValue;

public interface BubbleChartValueFormatter {

    public int formatChartValue(char[] formattedValue, BubbleValue value);
}
