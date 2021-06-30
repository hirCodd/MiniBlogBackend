package cn.simplethinking.miniblogapp.admin.service.impl;

import cn.simplethinking.miniblogapp.admin.dao.AdminArticleDao;
import cn.simplethinking.miniblogapp.admin.service.AdminArticleService;
import cn.simplethinking.miniblogapp.system.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @description
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @see
 * @since
 */
@Service
public class AdminArticleServiceImpl implements AdminArticleService {

    @Autowired
    AdminArticleDao adminArticleDao;

    @Override
    public boolean publishArticle(Article article) {
        adminArticleDao.insertArticle(article);
        return false;
    }

    @Override
    public List<Article> getArticles() {
        return adminArticleDao.listArticles();
    }


}
