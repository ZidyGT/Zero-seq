package domain;

import db.SequenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DbService {

    @Autowired
    SequenceRepository repository;

    public Sequence getSeq(Long id){
        return repository.findById(id).get();
    }

    public List<Sequence> getSeqs(){
        List<Sequence> list = new ArrayList<Sequence>();
        repository.findAll().forEach( item -> {
            list.add(item);
                }

        );
        return list;
    }

    public Long addSeq(Sequence seq){
        return repository.save(seq).getId();
    }
}
