package com.example.aop.service;

import org.springframework.web.multipart.MultipartFile;

import com.example.aop.entity.Attachment;

public interface AttachmentService {

	Attachment saveAttachment(MultipartFile file) throws Exception;

	Attachment getAttachment(String fileId) throws Exception;

}
