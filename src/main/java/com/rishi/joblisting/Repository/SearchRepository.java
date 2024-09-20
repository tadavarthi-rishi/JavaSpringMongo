package com.rishi.joblisting.Repository;

import com.rishi.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

        List<Post> findByText(String text);

}
