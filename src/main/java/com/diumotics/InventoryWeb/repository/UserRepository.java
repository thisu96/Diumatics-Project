package com.diumotics.InventoryWeb.repository;

import com.diumotics.InventoryWeb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
