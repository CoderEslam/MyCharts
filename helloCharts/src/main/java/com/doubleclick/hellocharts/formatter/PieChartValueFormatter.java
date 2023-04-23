package com.doubleclick.hellocharts.formatter;

import com.doubleclick.hellocharts.model.SliceValue;

public interface PieChartValueFormatter {

    public int formatChartValue(char[] formattedValue, SliceValue value);
}
