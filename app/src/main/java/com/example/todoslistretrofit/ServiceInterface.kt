package com.example.todoslistretrofit

import retrofit2.http.GET

interface ServiceInterface {
    @GET("todos")
    suspend fun getTodos(): List<Todo>
}
