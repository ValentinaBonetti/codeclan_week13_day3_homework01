package com.codeclan.example.filesAndFolders.components;

import com.codeclan.example.filesAndFolders.models.File;
import com.codeclan.example.filesAndFolders.models.Folder;
import com.codeclan.example.filesAndFolders.models.User;
import com.codeclan.example.filesAndFolders.repositories.FileRepository;
import com.codeclan.example.filesAndFolders.repositories.FolderRepository;
import com.codeclan.example.filesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User user = new User("vale");
        userRepository.save(user);

        Folder folder_01 = new Folder("folder_01", user);
        folderRepository.save(folder_01);

        File file_01 = new File("file_01","txt",100, folder_01);
        fileRepository.save(file_01);
    }

}
