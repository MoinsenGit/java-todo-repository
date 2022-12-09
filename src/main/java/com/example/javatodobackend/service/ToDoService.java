package com.example.javatodobackend.service;

import com.example.javatodobackend.model.ToDo;
import com.example.javatodobackend.model.ToDoDTO;
import com.example.javatodobackend.repo.ToDoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


// da nur ein Repo ist hier Service eigentlich nicht nötig

@Service
@RequiredArgsConstructor
public class ToDoService {

    private final ToDoRepo toDoRepo;

    // GET getToDo
    public List<ToDo> getToDo() {
        return toDoRepo.getToDo();
    }

    // POST addToDo
    public ToDo addToDo(ToDoDTO toDoDTO) {
        ToDo x = new ToDo();
        x.setDescription(toDoDTO.getDescription());
        x.setStatus(toDoDTO.getStatus());
        x.setId(String.valueOf(UUID.randomUUID()));
        // x.setId(UUID.randomUUID().toString()); auch möglich

        return toDoRepo.addToDo(x);
    }

    public ToDo advanceToDo(ToDo toDo) {
        return toDoRepo.advanceToDo(toDo);
    }

/*
    public ToDo advanceToDo(ToDo toDo) {
        return toDoRepo.advanceToDo();
    }

 */
}
