package com.jiaruiblog.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * @ClassName TagDocRelationship
 * @Description TODO
 * @Author luojiarui
 * @Date 2022/6/4 10:31 上午
 * @Version 1.0
 **/
@Data
public class TagDocRelationship {

    @Id
    private Long id;

    // 分类id
    Long tagId;

    // 文件id
    Long fileId;

    private Date createDate;

    private Date updateDate;

}