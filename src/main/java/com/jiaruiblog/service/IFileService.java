package com.jiaruiblog.service;

import com.jiaruiblog.entity.DTO.DocumentDTO;
import com.jiaruiblog.entity.FileDocument;
import com.jiaruiblog.utils.ApiResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

public interface IFileService {


    /**
     * 保存文件 - 表单
     *
     * @param md5
     * @param file
     * @return
     */
    FileDocument saveFile(String md5, MultipartFile file);

    /**
     * 保存文件 - js文件流
     *
     * @param fileDocument
     * @param inputStream
     * @return
     */
    FileDocument saveFile(FileDocument fileDocument, InputStream inputStream);

    /**
     * 删除文件
     *
     * @param id
     * @param isDeleteFile 是否删除文件
     * @return
     */
    void removeFile(String id, boolean isDeleteFile);

    /**
     * 根据id获取文件
     *
     * @param id
     * @return
     */
    Optional<FileDocument> getById(String id);

    /**
     * 根据md5获取文件对象
     *
     * @param md5
     * @return
     */
    FileDocument getByMd5(String md5);

    /**
     * 分页查询，按上传时间降序
     *
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<FileDocument> listFilesByPage(int pageIndex, int pageSize);

    /**
     * 分页检索目前的文档信息
     * @param documentDTO
     * @return
     */
    ApiResult list(DocumentDTO documentDTO);

    /**
     *根据文档的详情，查询该文档的详细信息
     *
     * @param id ->Long
     * @return ApiResult
     */
    ApiResult detail(Long id);

    /**
     * 删除掉已经存在的文档
     *
     * @param id -> Long
     * @return ApiResult
     */
    ApiResult remove(Long id);

}
