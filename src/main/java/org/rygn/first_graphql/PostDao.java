package org.rygn.first_graphql;

import java.util.List;
import java.util.stream.Collectors;

public class PostDao {

	private List<Post> posts;

    public PostDao(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> getRecentPosts(int count, int offset) {
    	return posts.stream().skip(offset).limit(count).collect(Collectors.toList());
    }
}
