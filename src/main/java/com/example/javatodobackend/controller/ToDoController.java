package com.example.javatodobackend.controller;

import com.example.javatodobackend.model.ToDo;
import com.example.javatodobackend.model.ToDoDTO;
import com.example.javatodobackend.repo.ToDoRepo;
import com.example.javatodobackend.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
@RequiredArgsConstructor
public class ToDoController {

    private final ToDoService toDoService;

    @GetMapping
    public List<ToDo> getToDo() {
        return toDoService.getToDo();
    }

    @PostMapping
    public ToDo addToDo(@RequestBody ToDoDTO toDoDTO){
        return toDoService.addToDo(toDoDTO);
        // Rückgabewerte werden nicht benötigt
        // return wichtig für Testen
    }

    @PutMapping("/{id}")
    public ToDo advanceToDo(@RequestBody ToDo toDo){
        return toDoService.advanceToDo(toDo);
    }

}
