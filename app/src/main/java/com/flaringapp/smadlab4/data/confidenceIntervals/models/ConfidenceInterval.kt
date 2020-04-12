package com.flaringapp.smadlab4.data.confidenceIntervals.models

import com.flaringapp.smadlab4.data.confidenceIntervals.ConfidenceIntervalsCalculator

data class ConfidenceInterval(
    override val left: Double,
    override val right: Double
): ConfidenceIntervalsCalculator.IConfidenceInterval