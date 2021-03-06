package com.roslib.control_msgs;

import java.lang.*;

public class FollowJointTrajectoryFeedback implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String[] joint_names;
    public com.roslib.trajectory_msgs.JointTrajectoryPoint desired;
    public com.roslib.trajectory_msgs.JointTrajectoryPoint actual;
    public com.roslib.trajectory_msgs.JointTrajectoryPoint error;

    public FollowJointTrajectoryFeedback() {
        this.header = new com.roslib.std_msgs.Header();
        this.joint_names = null;
        this.desired = new com.roslib.trajectory_msgs.JointTrajectoryPoint();
        this.actual = new com.roslib.trajectory_msgs.JointTrajectoryPoint();
        this.error = new com.roslib.trajectory_msgs.JointTrajectoryPoint();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_joint_names = this.joint_names != null ? this.joint_names.length : 0;
        outbuffer[offset + 0] = (byte)((length_joint_names >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_joint_names >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_joint_names >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_joint_names >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_joint_names; i++){
        int length_joint_namesi = this.joint_names[i].getBytes().length;
        outbuffer[offset + 0] = (byte)((length_joint_namesi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_joint_namesi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_joint_namesi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_joint_namesi >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_joint_namesi; k++) {
            outbuffer[offset + k] = (byte)((this.joint_names[i].getBytes())[k] & 0xFF);
        }
        offset += length_joint_namesi;
        }
        offset = this.desired.serialize(outbuffer, offset);
        offset = this.actual.serialize(outbuffer, offset);
        offset = this.error.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_joint_names = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_joint_names |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_joint_names |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_joint_names |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_joint_names > 0) {
            this.joint_names = new java.lang.String[length_joint_names];
        }
        for (int i = 0; i < length_joint_names; i++){
        int length_joint_namesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_joint_namesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_joint_namesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_joint_namesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_joint_namesi = new byte[length_joint_namesi];
        for(int k= 0; k< length_joint_namesi; k++){
            bytes_joint_namesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.joint_names[i] = new java.lang.String(bytes_joint_namesi);
        offset += length_joint_namesi;
        }
        offset = this.desired.deserialize(inbuffer, offset);
        offset = this.actual.deserialize(inbuffer, offset);
        offset = this.error.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 4;
        int length_joint_names = this.joint_names != null ? this.joint_names.length : 0;
        for (int i = 0; i < length_joint_names; i++) {
        int length_joint_namesi = this.joint_names[i].getBytes().length;
        length += 4;
        length += length_joint_namesi;
        }
        length += this.desired.serializedLength();
        length += this.actual.serializedLength();
        length += this.error.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "control_msgs/FollowJointTrajectoryFeedback"; }
    public java.lang.String getMD5(){ return "3cc80438af91c1f629c440edb7d6e8d0"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
