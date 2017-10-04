package com.georgiy.contactchat.repository;

import com.georgiy.contactchat.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
