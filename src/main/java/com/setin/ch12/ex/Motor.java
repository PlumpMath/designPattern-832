package com.setin.ch12.ex;

/**
 * Created by 두석 on 2016-07-03.
 */
public abstract class Motor {
    private MotorStatus motorStatus;

    public Motor(){
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public Motor(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction){
        if(motorStatus == MotorStatus.MOVING){
            return;
        }

        moveMotor(direction);

        setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor(Direction direction);

    public void stop(){
        motorStatus = MotorStatus.STOPPED;
    }
}
