package com.patika.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserResponse {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    List<GetCarResponse> cars;
}
