package ru.neoflex.prac01;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flush")
public class DataBaseController {
    @Autowired
    private RepositoryTransHistory TRepository;

    @GetMapping("/all")
    public List <TableTransHistory> getAllT() {

        return TRepository.findAll();
    }
    public TableTransHistory createTTH(@Valid @RequestBody TableTransHistory TTH) {
        return TRepository.save(TTH);
    }
}
