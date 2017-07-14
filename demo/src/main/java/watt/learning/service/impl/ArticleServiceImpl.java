package watt.learning.service.impl;

import org.springframework.stereotype.Component;
import watt.learning.service.ArticleService;

@Component(value = "articleService100")
public class ArticleServiceImpl implements ArticleService {
    @Override
    public void add(String title, String content) {
        //....
    }
}
