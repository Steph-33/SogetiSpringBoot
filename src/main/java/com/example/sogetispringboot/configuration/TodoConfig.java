package com.example.sogetispringboot.configuration;

import com.example.sogetispringboot.model.TodoModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class TodoConfig {

    @Bean
    public List<TodoModel> todos(){
        List<TodoModel> data = new ArrayList<>();
        data.addAll(Arrays.asList(
                new TodoModel("Créer un contrôleur. "),
                new TodoModel("Utiliser le bean dans le contrôleur. "),
                new TodoModel("Faire les méthode get/getById/post/put/patch/delete."),
                new TodoModel("Tester son code. "),
                new TodoModel("Quand j'ai fini, je lève la main dans la conversation. ")
        ));
        return data;
    }
}
