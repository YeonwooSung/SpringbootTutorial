package com.example.videostreaming.controller;

import java.io.File;
import java.io.FileInputStream;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.videostreaming.stream.StreamingResponseBody;

@RestController
public class FileResponseController {
    @GetMapping(path = "/video")
    public ResponseEntity<StreamingResponseBody> video() {
        File file = new File("~/test.mp4");
        if (!file.isFile()) {
            return ResponseEntity.notFound().build();
        }
        System.out.println("here!!!!!!!!!!!!!!!!!!!");

        StreamingResponseBody streamingResponseBody = outputStream -> FileCopyUtils.copy(new FileInputStream(file), outputStream);

        final HttpHeaders responseHeaders = new HttpHeaders(null);
        responseHeaders.add("Content-Type", "video/mp4");
        responseHeaders.add("Content-Length", Long.toString(file.length()));

        return ResponseEntity.ok().headers(responseHeaders).body(streamingResponseBody);
    }
}
