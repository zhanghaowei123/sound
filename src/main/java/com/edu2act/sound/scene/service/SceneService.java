package com.edu2act.sound.scene.service;

import com.edu2act.sound.entity.Scene;
import com.edu2act.sound.scene.dao.SceneRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(readOnly = false)
public class SceneService {

    @Resource
    private SceneRepository sceneRepository;

    public List<Scene> listAll(){
        return this.sceneRepository.findAll();
    }

}
