package br.com.meli.diplomat;

import br.com.meli.diplomat.entity.Student;
import br.com.meli.diplomat.entity.Subject;
import br.com.meli.diplomat.sevices.CertificateService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
public class DiplomatControllerTest {

    @Autowired
    private MockMvc mock;

    @Autowired
    private final ObjectMapper mapper = new ObjectMapper();

    @MockBean
    private CertificateService certificateService;

    private List<Subject> subjects;

    @BeforeEach
    public void init(){

        subjects = new ArrayList<>();

        subjects.add(new Subject("Matematica", 7));
        subjects.add(new Subject("Portugues", 5));
        subjects.add(new Subject("Fisica", 10));

    }

    @Test
    public void getDiplomatTest() throws Exception {

        when(certificateService.diplomat(1)).thenReturn("Test");

        Student student = new Student(1,"Caio",subjects);

        String requestBody = mapper.writeValueAsString(student);
        mock.perform(post("/").contentType("application/json").content(requestBody)).andExpect(status().isOk())
                .andExpect(content().string(containsString("Test")));

    }

    @Test
    public void getDiplomatNullTest() throws Exception {

        mock.perform(post("/").contentType("application/json").content("")).andExpect(status().isBadRequest());

    }


    @Test
    public void getNotesRouteTest() throws Exception {

        Student student = new Student(1,"Caio",subjects);

        String requestBody = mapper.writeValueAsString(student);
        mock.perform(get("/").contentType("application/json").content(requestBody)).andExpect(status().isOk());

    }

    @Test
    public void getNotesRouteNullTest() throws Exception {

        mock.perform(get("/").contentType("application/json").content("")).andExpect(status().isBadRequest());

    }


}
