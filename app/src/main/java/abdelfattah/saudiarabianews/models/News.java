package abdelfattah.saudiarabianews.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class News {

    @SerializedName("articles")
    @Expose
    private List<Article> article;

    public List<Article> getArticle() {
        return article;
    }

}