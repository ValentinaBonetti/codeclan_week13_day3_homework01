package com.codeclan.example.filesAndFolders.repositories;

import com.codeclan.example.filesAndFolders.models.User;
import com.codeclan.example.filesAndFolders.projections.EmbedForUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
