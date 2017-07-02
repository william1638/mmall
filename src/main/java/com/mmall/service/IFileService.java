package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by William on 2017/7/2.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
