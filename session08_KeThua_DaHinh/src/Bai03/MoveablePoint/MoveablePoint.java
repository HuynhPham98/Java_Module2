package Bai03.MoveablePoint;

import Bai03.Point.Point;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(float xSpeed, float ySpeed) {
        return new float[] { this.xSpeed, this.ySpeed };
    }

    @Override
    public String toString() {
        return "(" +super.getX()+ ", " +super.getY()+ ", speed = ( " +this.getxSpeed()+ ", " +this.getySpeed() +") ";
    }

    public MoveablePoint move() {
        super.setX( super.getX()+xSpeed );
        super.setY(super.getY() + ySpeed);
        return this;
    }
}
