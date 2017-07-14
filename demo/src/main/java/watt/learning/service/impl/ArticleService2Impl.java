package watt.learning.service.impl;

import org.springframework.stereotype.Component;
import watt.learning.service.ArticleService;

@Component(value = "articleService200")
public class ArticleService2Impl implements ArticleService {
    @Override
    public void add(String title, String content) {
        //....
    }
}
