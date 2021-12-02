package com.alvarolc.pmpd_playground.ut2.ut02_ex02.data

import com.alvarolc.pmpd_playground.ut2.ut02_ex02.domain.UserModel
import com.alvarolc.pmpd_playground.ut2.ut02_ex02.domain.UserRepository

class UserDataRepository: UserRepository {
    override fun fetchUsers(): List<UserModel> = mutableListOf(
        UserModel(1, "Name01", "surname01",1),
        UserModel(2, "Name02", "surname02",1),
        UserModel(3, "Name03", "surname03",1),
        UserModel(4, "Name04", "surname04",1),
        UserModel(5, "Name05", "surname05",1),
        UserModel(6, "Name06", "surname05",1),
        UserModel(7, "Name07", "surname05",1),
        UserModel(8, "Name08", "surname05",1),
        UserModel(9, "Name09", "surname05",1),
        UserModel(10, "Name10", "surname05",1),
        UserModel(11, "Name11", "surname05",1),
        UserModel(12, "Name12", "surname05",1),
        UserModel(13, "Name13", "surname13",1),
        UserModel(14, "Name14", "surname14",1),
        UserModel(15, "Name15", "surname15",1)
    )
}