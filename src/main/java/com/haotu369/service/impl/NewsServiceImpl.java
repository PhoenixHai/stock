package com.haotu369.service.impl;

import com.haotu369.dao.NewsDao;
import com.haotu369.model.News;
import com.haotu369.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : Jian Shen
 * @version : V1.0
 * @date : 2018/4/21
 */
@Service
@Transactional
public class NewsServiceImpl implements NewsService{

    @Autowired
    private NewsDao newsDao;

    @Override
    public List<News> listNews() {
        List<News> news = newsDao.listNews();
        return news;
    }
}