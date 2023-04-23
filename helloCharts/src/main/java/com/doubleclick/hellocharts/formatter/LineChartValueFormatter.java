package com.doubleclick.hellocharts.formatter;


import com.doubleclick.hellocharts.model.PointValue;

public interface LineChartValueFormatter {

    public int formatChartValue(char[] formattedValue, PointValue value);
}
