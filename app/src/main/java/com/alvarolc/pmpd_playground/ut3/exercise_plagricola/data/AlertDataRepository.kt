package com.alvarolc.pmpd_playground.ut3.exercise_plagricola.data

class AlertDataRepository: AlertRepository {
}

class MvvmDataRepository: MvvmRepository {
    override fun getMvvm(): MvvmModel {
        TODO("Not yet implemented")
    }

    override fun saveMvvm(MvvmModel: MvvmModel) {
        TODO("Not yet implemented")
    }

    override fun removeMvvm(id: String) {
        TODO("Not yet implemented")
    }

    override fun getMvvmAll(): List<MvvmModel> {
        TODO("Not yet implemented")
    }
}