package com.example.sogetispringboot.controller;

import com.example.sogetispringboot.model.TodoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private List<TodoModel> todos;

    @Autowired
    public TodoController(List<TodoModel> todos){
        this.todos = todos;
    }

    @GetMapping("/maTodo")
    @ResponseStatus(code = HttpStatus.OK)
    public List<TodoModel> getTodo(){
        return todos;
    }

    @GetMapping("/maTodo/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public TodoModel getTodo(@PathVariable int id){
        TodoModel todo = todos.get(id-1);
        return todo;
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public TodoModel putTodo(@PathVariable int id, @RequestBody String item){
        for(int i = 0 ; i < todos.size(); i++){
            if(todos.get(i).getId() == id){
                todos.get(i).setTask(item);
                return todos.get(i);
            }
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST);

    }

     /**
    @PatchMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public String patchMessage(@PathVariable int id, @RequestBody String item){
        message = item;
        return message;
    }
    **/

     @PostMapping("")
     @ResponseStatus(code = HttpStatus.OK)
     public List<TodoModel> postTodo(@RequestBody TodoModel item){
         todos.add(item);
         return todos;
     }

}
