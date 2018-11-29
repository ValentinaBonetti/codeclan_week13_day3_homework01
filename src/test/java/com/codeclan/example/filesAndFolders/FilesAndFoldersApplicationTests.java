package com.codeclan.example.filesAndFolders;

import com.codeclan.example.filesAndFolders.models.File;
import com.codeclan.example.filesAndFolders.models.Folder;
import com.codeclan.example.filesAndFolders.models.User;
import com.codeclan.example.filesAndFolders.repositories.FileRepository;
import com.codeclan.example.filesAndFolders.repositories.FolderRepository;
import com.codeclan.example.filesAndFolders.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesAndFoldersApplicationTests {

	User user_02;
	Folder folder_02;
	File file_02;

	@Before
	public void setUp(){
		user_02 = new User("Julie");
		userRepository.save(user_02);
		folder_02 = new Folder("folder_02",user_02);
		folderRepository.save(folder_02);
		file_02 = new File("file_02","txt",120,folder_02);
		fileRepository.save(file_02);
	}


	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserFolderAndFileThenSave() {

	}
}
