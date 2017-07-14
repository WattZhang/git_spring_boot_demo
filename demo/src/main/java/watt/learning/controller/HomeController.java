//package watt.learning.controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import watt.learning.service.ArticleService;
//
//@RestController
//public class HomeController {
//
//    @Qualifier("articleService100")
//    ArticleService as;
//
//    @RequestMapping("/")
//    String home() {
//        return "hello\n";
//    }
//
//
//    @RequestMapping("/add")
//    String addArticle(@RequestParam("title") String myTitle, @RequestParam("content") String myContent) {
//        //as.add(title, content);
//        return "";
//    }
//}
