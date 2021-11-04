package com.alvarolc.pmpd_playground.ut3.exercise_plagricola.data

import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.AlertModel
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.AlertRepository
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.FileModel

class AlertDataRepository: AlertRepository {

    override fun getAlertAll(): List<AlertModel> {
        return mutableListOf(
            AlertModel(
                "1",
                "title 01",
                1,
                "summary 01",
                "2021-01-01",
                "body 1",
                "source 01",
                mutableListOf(
                    FileModel("name 01", "url 01")
                )
            ),
            AlertModel(
                "2",
                "title 02",
                1,
                "summary 02",
                "2021-01-01",
                "body 2",
                "source 02",
                mutableListOf(
                    FileModel("name 02", "url 02")
                )
            ),
            )
    }

}
