package com.jun.lineyou.constant;

/**
 * 视图枚举
 */
public enum ViewFxml {

    /**
     * 登入视图
     */
    SIGN_IN("/fxml/sign-in.fxml"),

    /**
     * 主视图
     */
    MAIN("/fxml/main.fxml"),

    SIGN_UP("/fxml/sign-up.fxml"),

    SEARCH_FRIEND("/fxml/search-friend.fxml");

    private final String name;

    ViewFxml(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
