package com.jinhyeon.service;

import org.springframework.stereotype.Service;

import com.jinhyeon.domain.User;

@Service
public interface UserService {
	User getUser(int id);
}
