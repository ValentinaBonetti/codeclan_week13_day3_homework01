package com.codeclan.example.filesAndFolders.repositories;

import com.codeclan.example.filesAndFolders.models.File;
import com.codeclan.example.filesAndFolders.projections.EmbedForFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
