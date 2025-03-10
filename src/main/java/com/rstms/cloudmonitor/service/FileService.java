package com.rstms.cloudmonitor.service;

import com.rstms.cloudmonitor.model.*;
import com.rstms.cloudmonitor.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;

    public String uploadFile(MultipartFile file) throws IOException {
        FileEntity newFile = new FileEntity(file.getOriginalFilename(), file.getContentType(), file.getBytes());
        fileRepository.save(newFile);
        return "File uploaded successfully!";
    }

    public List<FileEntity> getAllFiles() {
        return fileRepository.findAll();
    }

    public Optional<FileEntity> getFileById(Long id) {
        return fileRepository.findById(id);
    }
}
