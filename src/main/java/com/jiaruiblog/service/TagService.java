package com.jiaruiblog.service;

import com.jiaruiblog.entity.Tag;
import com.jiaruiblog.entity.TagDocRelationship;
import com.jiaruiblog.util.BaseApiResult;

import java.util.List;
import java.util.Map;

/**
 * @Author Jarrett Luo
 * @Date 2022/6/7 11:39
 * @Version 1.0
 */
public interface TagService {

    /**
     * insert
     * @param tag tag
     * @return result
     */
    BaseApiResult insert(Tag tag);

    /**
     * update
     * @param tag tag
     * @return result
     */
    BaseApiResult update(Tag tag);

    /**
     * remove
     * @param tag tag
     * @return result
     */
    BaseApiResult remove(Tag tag);

    /**
     * query
     * @param tag tag
     * @return result
     */
    BaseApiResult queryById(Tag tag);

    /**
     * search
     * @param tag tag
     * @return result
     */
    BaseApiResult search(Tag tag);

    /**
     * list
     * @return result
     */
    BaseApiResult list();

    /**
     * add relationship
     * @param relationship
     * @return
     */
    BaseApiResult addRelationShip(TagDocRelationship relationship);

    /**
     * cancel relationship
     * @param relationship TagDocRelationShip
     * @return result
     */
    BaseApiResult cancelTagRelationship(TagDocRelationship relationship);

    /**
     * get all relationships
     * @return result
     */
    Map<Tag, List<TagDocRelationship>> getRecentTagRelationship();

}
