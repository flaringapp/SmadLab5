package com.flaringapp.smadlab5.data.confidenceIntervals.models

import com.flaringapp.smadlab5.data.confidenceIntervals.ConfidenceIntervalsCalculator

data class ConfidenceInterval(
    override val left: Double,
    override val right: Double
): ConfidenceIntervalsCalculator.IConfidenceInterval