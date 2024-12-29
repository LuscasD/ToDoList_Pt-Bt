package com.example.listadetarefas

import java.time.LocalDate
import java.time.LocalTime
import java.util.UUID

class TaskItem(
    var name: String,
    var desc: String,
    var doTime: LocalTime?,
    var completedDate: LocalDate,
    var id: UUID = UUID.randomUUID()
)
{

}