package com.edu2act.sound.scene.controller;

import com.edu2act.sound.entity.Scene;
import com.edu2act.sound.scene.service.SceneService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/scene")
public class SceneController {

    @Resource
    private SceneService sceneService;

    @RequestMapping("/list")
    public List<Scene> list(){
        System.out.println("list");
        return this.sceneService.listAll();
    }
}
