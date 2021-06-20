package com.antra.evaluation.reporting_system.repo;

import com.antra.evaluation.reporting_system.pojo.report.ExcelFile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExcelRepository extends MongoRepository<ExcelFile, String> {
    //Optional<ExcelFile> getFileById(String id);

    //ExcelFile saveFile(ExcelFile file);

    //ExcelFile deleteFile(String id);

    //List<ExcelFile> getFiles();
}
