package aiss.GitLabMiner.Tests;

import aiss.GitLabMiner.services.ProjectService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectServiceTest {

    @Autowired
    ProjectService service;

    @Test
    @DisplayName("Get Project")

    void findProject() {
        Project project = service.findProject();
        //assertTrue(!project.equals(null), "Project not found");
        System.out.println(project);
    }
}