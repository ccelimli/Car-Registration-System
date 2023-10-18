package com.patika.business.abstracts;

import com.patika.business.request.*;
import com.patika.business.response.GetUserResponse;
import com.patika.entities.User;
import com.patika.utilities.results.DataResult;
import com.patika.utilities.results.Result;

public interface UserService {
    DataResult<AddUserRequest> add(AddUserRequest addUserRequest);

    Result delete(int id);

    DataResult<User> update(UpdateUserRequest updateUserRequest);

    Result register(RegisterRequest registerRequest);

    DataResult<GetUserResponse> login(LoginRequest loginRequest);

    Result changePassword(ChangePasswordRequest changePasswordRequest);
}
