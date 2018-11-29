package com.codeclan.example.filesAndFolders.projections;

import com.codeclan.example.filesAndFolders.models.Folder;
import com.codeclan.example.filesAndFolders.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedForUser", types = User.class)
public interface EmbedForUser {
    String getName();
    List<Folder> getFolders();
}
