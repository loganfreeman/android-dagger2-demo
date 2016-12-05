package com.loganfreeman.dagger2demo;

import java.util.List;

/**
 * Created by scheng on 12/4/16.
 */

public interface MainScreenContract {
    interface View {
        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {
        void loadPost();
    }
}
