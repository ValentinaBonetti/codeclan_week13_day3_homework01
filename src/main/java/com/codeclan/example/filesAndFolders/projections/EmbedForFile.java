package com.codeclan.example.filesAndFolders.projections;


import com.codeclan.example.filesAndFolders.models.File;
import com.codeclan.example.filesAndFolders.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedForFile", types = File.class)
public interface EmbedForFile {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
