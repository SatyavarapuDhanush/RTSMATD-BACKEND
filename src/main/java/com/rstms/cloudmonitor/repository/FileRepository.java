package com.rstms.cloudmonitor.repository;

import com.rstms.cloudmonitor.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long> {}
