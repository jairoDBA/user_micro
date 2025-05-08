package com.user.infrastructure.controllers;


import com.user.application.usecase.port.input.RegisterUserService;
import com.user.infrastructure.controllers.request.UserRequest;
import com.user.infrastructure.controllers.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expense")
public class UserController {

    @Autowired
    private RegisterUserService registerUserService;

    //LISTAR USUARIOS POR ID ,
    //LISTAR TODOS LOS USUARIOS
    //REGISTRAR USUARIO
    @PostMapping(produces = "application/json")
    public ResponseEntity<UserResponse> saveExpense(@RequestBody UserRequest userRequest) {

      //  ExpenseResponse expenseSaved = saveExpenseService.saveExpense(expenseRequest);
            UserResponse userResponse = new UserResponse();
        return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
    }
    //BORRAR USUARIO
    //EDITAR USUARIO
}
