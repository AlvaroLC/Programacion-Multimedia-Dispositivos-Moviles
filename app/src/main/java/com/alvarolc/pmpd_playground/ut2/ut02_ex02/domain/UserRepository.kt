package com.alvarolc.pmpd_playground.ut2.ut02_ex02.domain

interface UserRepository {
    fun fetchUsers(): List<UserModel>
}