package com.doubleclick.hellocharts.provider;

import com.doubleclick.hellocharts.model.LineChartData;

public interface LineChartDataProvider {

    public LineChartData getLineChartData();

    public void setLineChartData(LineChartData data);

}
