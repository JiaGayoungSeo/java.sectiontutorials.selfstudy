package com.sectiontutorials.Class_java;

public class Node {
    //외부에서 함부로 접근할수 없도록(함부로 바꿀수 없도록) private으로 처리
    //현재 블록안에서만 접근 가능함
    private int x;
    private int y;

    //은닉된 멤버변수의 값을 읽는 방법 -> get 메소드를 사용하여
    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    //은닉된 멤버 변수에 값을 넣는 방법 -> 메소드를 사용하여 setter
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public Node(int x, int y) { // 생성자 만들어주기
        this.x = x;
        this.y = y;
    }

    public Node getCenter(Node other){ // Node 타입의 반환형인 메소드& Node 타입을 매개변수로
        //새로운 인스턴스를 만들어서 자신이 갖고있는 좌표와 다른 점의 좌표의 가운데를 반환한다
        return new Node((this.x+other.getX())/2, (this.y+other.getY())/2);
    }


}
