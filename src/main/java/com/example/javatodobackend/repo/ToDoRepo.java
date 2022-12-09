package com.example.javatodobackend.repo;

import com.example.javatodobackend.model.ToDo;
import com.example.javatodobackend.model.ToDoDTO;
import com.example.javatodobackend.service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class ToDoRepo {


    private final HashMap<String, ToDo> toDoList = new HashMap<>();

    // getAllTodos
    public List<ToDo> getToDo() {
        return new ArrayList<>(toDoList.values());
    }

    // postTodoOnList
    public ToDo addToDo(ToDo newToDo) {
        toDoList.put(newToDo.getId(), newToDo);
        return newToDo;
    }


    public ToDo advanceToDo(ToDo toDo) {
        toDoList.put(toDo.getId(), toDo);

        return toDo;

    }

    // deleteToDoById
    public ToDo deleteToDoById(ToDo toDo) {
        toDoList.remove(toDo.getId(), toDo);

        return toDo;

    }

}



    // getTodoById
    // putTodoById - Status ändern




    // Konstruktor
