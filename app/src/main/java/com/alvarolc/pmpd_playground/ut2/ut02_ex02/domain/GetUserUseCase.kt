package com.alvarolc.pmpd_playground.ut2.ut02_ex02.domain

class GetUserUseCase(private val repository: UserRepository) {

    fun execute(): List<UserModel> = repository.fetchUsers()
}