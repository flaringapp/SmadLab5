package com.flaringapp.smadlab5.app.di

import com.flaringapp.smadlab5.data.calculator.CharacteristicsCalculator
import com.flaringapp.smadlab5.data.calculator.CharacteristicsCalculatorImpl
import com.flaringapp.smadlab5.data.confidenceIntervals.ConfidenceIntervalsCalculator
import com.flaringapp.smadlab5.data.confidenceIntervals.ConfidenceIntervalsCalculatorImpl
import com.flaringapp.smadlab5.data.intervalSplitter.IntervalSplitter
import com.flaringapp.smadlab5.data.intervalSplitter.IntervalSplitterImpl
import com.flaringapp.smadlab5.data.varianceAnalyzer.VarianceAnalyzer
import com.flaringapp.smadlab5.data.varianceAnalyzer.VarianceAnalyzerImpl
import org.koin.dsl.module

val dataModule = module {

    single { IntervalSplitterImpl() as IntervalSplitter }

    single { CharacteristicsCalculatorImpl() as CharacteristicsCalculator }

    single { ConfidenceIntervalsCalculatorImpl(get()) as ConfidenceIntervalsCalculator }

    single { VarianceAnalyzerImpl() as VarianceAnalyzer }
}