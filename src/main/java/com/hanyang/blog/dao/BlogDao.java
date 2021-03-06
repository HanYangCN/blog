package com.hanyang.blog.dao;

import com.hanyang.blog.model.BlogEntry;

import java.util.List;

public interface BlogDao {
    boolean addEntry(BlogEntry blogEntry);
    List<BlogEntry> findAllEntries();
    BlogEntry findEntryBySlug(String slug);
}
