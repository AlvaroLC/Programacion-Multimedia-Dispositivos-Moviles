package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.presentation

import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.FileModel

data class AlertViewState(val id: String,
                          val title: String,
                          val type: Int,
                          val summary: String,
                          val datePublished: String,
                          val body: String,
                          val source: String,
                          val files: List<FileModel>
                         )