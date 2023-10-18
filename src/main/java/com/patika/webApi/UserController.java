package com.patika.webApi;

import com.patika.business.abstracts.UserService;
import com.patika.business.request.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    UserService _userService;

    @Autowired
    public UserController(UserService userService) {
        this._userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody AddUserRequest addUserRequest){
        return ResponseEntity.ok(this._userService.add(addUserRequest));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable int id){
        return ResponseEntity.ok(this._userService.delete(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Object> update(@RequestBody UpdateUserRequest updateUserRequest){
        return ResponseEntity.ok(this._userService.update(updateUserRequest));
    }

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody RegisterRequest registerRequest){
        return ResponseEntity.ok(this._userService.register(registerRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(this._userService.login(loginRequest));
    }

    @PostMapping("/changepassword")
    public ResponseEntity<Object> changePassword(@RequestBody ChangePasswordRequest changePasswordRequest){
        return ResponseEntity.ok(this._userService.changePassword(changePasswordRequest));
    }

}
