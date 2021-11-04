package com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain

data class AlertModel( val id: String, val title: String, val type: Int, val summary: String, val datePublished: String, val body: String, val source: String, val files: List<FileModel> )