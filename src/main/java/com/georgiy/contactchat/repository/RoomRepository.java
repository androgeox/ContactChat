package com.georgiy.contactchat.repository;

import com.georgiy.contactchat.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long>{
}
