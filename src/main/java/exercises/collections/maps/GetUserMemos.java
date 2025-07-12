package exercises.collections.maps;

import java.util.*;

public class GetUserMemos {
    public record User(Long userId, String name) {}
    public record Post(Long userId, String content) {}
    public record UserPost(String name, String content) {}

    public static List<User> getUsers() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 4000; i++) {
            User user = new User((long)i, UUID.randomUUID().toString());
            users.add(user);
        }
        return users;
    }

    public static List<Post> getPosts() {
        List<Post> posts = new ArrayList<>();
        for (int i = 0; i < 4000; i++) {
            Post post = new Post((long)i, UUID.randomUUID().toString());
            posts.add(post);
        }
        return posts;
    }

    public static List<UserPost> getUserPosts() {
        List<UserPost> userPosts = new ArrayList<>();
        for (User user : getUsers()) {
            for (Post post : getPosts()) {
                if (user.userId().equals(post.userId())) {
                    userPosts.add(new UserPost(user.name(), post.content()));
                }
            }
        }
        return userPosts;
    }

    public static List<UserPost> getUserPostsFast() {
        List<UserPost> userPosts = new ArrayList<>();

        /*
        Riempiamo una mappa con tutti gli users
         */
        Map<Long, User> users = new HashMap<>();
        for (User user : getUsers()) {
            users.put(user.userId(), user);
        }

        /*
        A questo punto, per ogni post controlliamo se il suo userId è presente nella lista degli users
         */
        for (Post post : getPosts()) {
            if (users.containsKey(post.userId())) {
                userPosts.add(new UserPost(users.get(post.userId()).name(), post.content()));
            }
        }

        return userPosts;
    }
}
