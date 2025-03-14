package com.APISpringBoot.first_spring_app.Tasks;

import com.APISpringBoot.first_spring_app.Users.UserModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name= "tb_tasks")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;

    private int priority;

    @OneToMany(mappedBy = "taskList")
    private List<UserModel> userList;
}
