package com.sivserver.example.hod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 29-Jun-17.
 */

@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/questionentry")

public class QuestionEntryApiController  {

    @Autowired
    private QuestionEntryRepository questionentryRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void questionEntry(
            @RequestParam(value = "sno", required = false) Integer sno,
            @RequestParam(value = "branchname", required = false) String branchname,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "semester", required = false) String semester,
            @RequestParam(value = "batch", required = false) String batch,
            @RequestParam(value = "scheme", required = false) String scheme,
            @RequestParam(value = "subjectname", required = false) String subjectname,
            @RequestParam(value = "subjectcode", required = false) String subjectcode,
            @RequestParam(value = "mark", required = false) Integer mark,
            @RequestParam(value = "unit", required = false) String unit,
            @RequestParam(value = "model", required = false) String model,
            @RequestParam(value = "category", required = false) String category,
            @RequestParam(value = "questiontype", required = false) String questiontype,
            @RequestParam(value = "question", required = false) String question,
            @RequestParam(value = "important", required = false) Boolean important,
            @RequestParam(value = "selected", required = false) Boolean selected,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        QuestionEntry quesentry = new QuestionEntry();

        quesentry.setSno(sno);
        quesentry.setBranchname(branchname);
        quesentry.setBranchcode(branchcode);
        quesentry.setAcademicyear(academicyear);
        quesentry.setSemester(semester);
        quesentry.setBatch(batch);
        quesentry.setScheme(scheme);
        quesentry.setSubjectname(subjectname);
        quesentry.setSubjectcode(subjectcode);
        quesentry.setMark(mark);
        quesentry.setUnit(unit);
        quesentry.setModel(model);
        quesentry.setCategory(category);
        quesentry.setQuestiontype(questiontype);
        quesentry.setQuestion(question);
        quesentry.setImportant(important);
        quesentry.setSelected(selected);
        quesentry.setLoginuser(loginuser);

        questionentryRepository.save(quesentry);
    }
}
