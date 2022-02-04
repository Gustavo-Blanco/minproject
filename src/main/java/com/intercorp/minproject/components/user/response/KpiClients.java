package com.intercorp.minproject.components.user.response;

public class KpiClients {

    private Double ageAverage;
    private Double standardDeviation;

    public KpiClients() {
    }

    public KpiClients(Double ageAverage, Double standardDeviation) {
        this.ageAverage = ageAverage;
        this.standardDeviation = standardDeviation;
    }

    public Double getAgeAverage() {
        return ageAverage;
    }

    public void setAgeAverage(Double ageAverage) {
        this.ageAverage = ageAverage;
    }

    public Double getStandardDeviation() {
        return standardDeviation;
    }

    public void setStandardDeviation(Double standardDeviation) {
        this.standardDeviation = standardDeviation;
    }
}
