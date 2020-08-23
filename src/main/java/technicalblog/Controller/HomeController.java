package technicalblog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getAllPosts(Model model){

        ArrayList<post> posts=new ArrayList<>();
      post Post1=new post();
      Post1.setTitle("Post 1");
      Post1.setBody("Post Body 1");
      Post1.setDate(new Date());

        post Post2=new post();
        Post2.setTitle("Post 2");
        Post2.setBody("Post Body 2");
        Post2.setDate(new Date());

        post Post3=new post();
        Post3.setTitle("Post 3");
        Post3.setBody("Post Body 3");
        Post3.setDate(new Date());


posts.add(Post1);
posts.add(Post2);
posts.add(Post3);

model.addAttribute("posts",posts);

return "index";
    }
}
