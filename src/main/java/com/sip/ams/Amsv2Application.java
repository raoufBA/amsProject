package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;
import com.sip.ams.controllers.ArticleController;

@SpringBootApplication
public class Amsv2Application {

	public static void main(String[] args) {
		new File(ArticleController.uploadDirectory).mkdir();
		SpringApplication.run(Amsv2Application.class, args);
	}

}
