package com.phegondev.HotelPhegon.service.impl.interfac;

import com.phegondev.HotelPhegon.dto.LogInRequest;
import com.phegondev.HotelPhegon.dto.Response;
import com.phegondev.HotelPhegon.entity.User;

public interface IUserService {

    Response register(User user);
    Response login(LogInRequest logInRequest);
    Response getAllUsers();
    Response getUserBookingHistory(String userId);
    Response deleteUser(String userId);
    Response getUserById(String userId);
    Response getMyInfo(String email);

}
