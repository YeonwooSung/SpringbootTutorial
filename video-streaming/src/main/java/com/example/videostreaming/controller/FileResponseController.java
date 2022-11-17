package com.example.videostreaming.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("video")
@AllArgsConstructor
public class FileResponseController {
    @GetMapping()
   public ResponseEntity<ByteArrayResource> getVideoByName() throws IOException{
       return ResponseEntity.ok(new ByteArrayResource(FileCopyUtils.copyToByteArray(new File("/Users/ywsung/test.mp4"))));
   }

}
