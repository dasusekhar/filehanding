package com.example.aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aop.entity.Attachment;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment,String> {

}
