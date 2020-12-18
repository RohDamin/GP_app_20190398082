
/*
작성자: 노다민
학번: 2019039082
파일명: CommentListView.java
구현사항: 리스트에 표시될 사진, 이름, 내용을 표시하는 View 구현
 */

package sdk.chat.gp_app.view;

public class CommentListView {

    private int src;
    private String name;
    private String nickname;

    public CommentListView(int src, String name, String nickname) {
        this.src = src;
        this.name = name;
        this.nickname = nickname;
    }

    public int getSrc() {
        return src;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }
}
