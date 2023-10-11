package com.patika.business.abstracts;

import com.patika.entities.User;
import com.patika.utilities.results.DataResult;
import com.patika.utilities.results.Result;

public interface UserService {
    public DataResult<User> add(User user);
    public Result delete(User user);
    public DataResult<User> update(User user);
    public Result register(User user);
    public Result login(String username, String password);
}
