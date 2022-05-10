package com.assam.elockcore.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.assam.elockcore.entity.ElockLangue;
import com.assam.elockcore.exception.ResourceNotFoundException;
import com.assam.elockcore.repository.ElockLangueRepository;
import com.assam.elockcore.service.proxy.UserProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("api/")
public class ElockLangueController {
    private static final Logger logger = LoggerFactory.getLogger(ElockLangueController.class);

    @Autowired
    ElockLangueRepository elockLangueRepository;

    private final UserProxy userProxy;

    public ElockLangueController(UserProxy userProxy){
        this.userProxy = userProxy;
    }

    @GetMapping("/elock_langue")
    List<ElockLangue> getAllElockLangues() {
        List<ElockLangue> elockLangues = new ArrayList<>();
        elockLangueRepository.findAll().forEach(elockLangues::add);
        return elockLangues;
    }

    @GetMapping("/elock_langue/{id}")
    ResponseEntity<ElockLangue> getElockLangueById(@Validated @PathVariable(value = "id") long elockLangueId) throws ResourceNotFoundException {
        ElockLangue elockLangue = this.elockLangueRepository.findById(elockLangueId)
            .orElseThrow(() -> new ResourceNotFoundException("Plante introuvable avec pour id = "+elockLangueId));
        return ResponseEntity.ok().body(elockLangue);
    }

    @PostMapping("/elock_langue")
    public ResponseEntity<?> createElockLangue(@Validated @RequestBody ElockLangue elockLangue) throws ResourceNotFoundException {
        logger.debug("UserProxy", userProxy.getUserById(elockLangue.getUserId()));
        if(elockLangue.getLangue().toString().isEmpty()) {
            return new ResponseEntity<>("La langue est obligatoire!", HttpStatus.NO_CONTENT);
        }else if(elockLangue.getElockName().isEmpty()){
            return new ResponseEntity<>("Le nom de la plante est obligatoire!", HttpStatus.NO_CONTENT);
        }else if(userProxy.getUserById(elockLangue.getUserId()) == null){
            return new ResponseEntity<>("Le créateur est inexistant!", HttpStatus.NO_CONTENT);
        }else
            elockLangue.setIsVisible(false);
        return ResponseEntity.ok(elockLangueRepository.save(elockLangue));
    }

    @PutMapping("/elock_langue")
    public ResponseEntity<?> updateElockLangue(@Validated @RequestBody ElockLangue elockLangue) {
        Optional<ElockLangue> elockLangueInfo = elockLangueRepository.findById(elockLangue.getId());
        if(elockLangueInfo.isPresent()) {
            ElockLangue _elockLangueInfo = elockLangueInfo.get();
            _elockLangueInfo.setElockName(elockLangue.getElockName());
            _elockLangueInfo.setIsVisible(elockLangue.getIsVisible());
            _elockLangueInfo.setLangue(elockLangue.getLangue());
            return ResponseEntity.ok(elockLangueRepository.save(_elockLangueInfo));
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/elock_langue/{id}")
    public ResponseEntity<?> deleteElockLangue(@Validated @PathVariable(value = "id") long elokLangueId) throws ResourceNotFoundException {
        ElockLangue elokLangue = this.elockLangueRepository.findById(elokLangueId)
            .orElseThrow(() -> new ResourceNotFoundException("ElockName introuvable avec pour id = "+elokLangueId));
        elockLangueRepository.delete(elokLangue);
        return new ResponseEntity<>("Suppression effectuée avec succès", HttpStatus.OK); 
    }
    
}
