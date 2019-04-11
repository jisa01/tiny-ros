package com.roslib.create_node;

import java.lang.*;

public class RawTurtlebotSensorState implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public int bumps_wheeldrops;
    public boolean wall;
    public boolean cliff_left;
    public boolean cliff_front_left;
    public boolean cliff_front_right;
    public boolean cliff_right;
    public boolean virtual_wall;
    public int motor_overcurrents;
    public int dirt_detector_left;
    public int dirt_detector_right;
    public int remote_opcode;
    public int buttons;
    public short distance;
    public short angle;
    public int charging_state;
    public int voltage;
    public short current;
    public byte temperature;
    public int charge;
    public int capacity;
    public int wall_signal;
    public int cliff_left_signal;
    public int cliff_front_left_signal;
    public int cliff_front_right_signal;
    public int cliff_right_signal;
    public int user_digital_inputs;
    public int user_analog_input;
    public int charging_sources_available;
    public int oi_mode;
    public int song_number;
    public boolean song_playing;
    public int number_of_stream_packets;
    public short requested_velocity;
    public short requested_radius;
    public short requested_right_velocity;
    public short requested_left_velocity;
    public static final int OI_MODE_OFF = (int)( 0);
    public static final int OI_MODE_PASSIVE = (int)( 1);
    public static final int OI_MODE_SAFE = (int)( 2);
    public static final int OI_MODE_FULL = (int)( 3);
    public static final int REMOTE_LEFT = (int)( 129);
    public static final int REMOTE_FORWARD = (int)( 130);
    public static final int REMOTE_RIGHT = (int)( 131);
    public static final int REMOTE_SPOT = (int)( 132);
    public static final int REMOTE_MAX = (int)( 133);
    public static final int REMOTE_SMALL = (int)( 134);
    public static final int REMOTE_MEDIUM = (int)( 135);
    public static final int REMOTE_LARGE = (int)( 136);
    public static final int REMOTE_CLEAN = (int)( 136);
    public static final int REMOTE_PAUSE = (int)( 137);
    public static final int REMOTE_POWER = (int)( 138);
    public static final int REMOTE_ARC_LEFT = (int)( 139);
    public static final int REMOTE_ARC_RIGHT = (int)( 140);
    public static final int REMOTE_DRIVE_STOP = (int)( 141);
    public static final int REMOTE_SEND_ALL = (int)( 142);
    public static final int REMOTE_SEEK_DOCK = (int)( 143);
    public static final int REMOTE_RESERVED = (int)( 240);
    public static final int REMOTE_FORCE_FIELD = (int)( 242);
    public static final int REMOTE_GREEN_BUOY = (int)( 244);
    public static final int REMOTE_GREEN_BUOY_AND_FORCE_FIELD = (int)( 246);
    public static final int REMOTE_RED_BUOY = (int)( 248);
    public static final int REMOTE_RED_BUOY_AND_FORCE_FIELD = (int)( 250);
    public static final int REMOTE_RED_BUOY_AND_GREEN_BUOY = (int)( 252);
    public static final int REMOTE_RED_BUOY_AND_GREEN_BUOY_AND_FORCE_FIELD = (int)( 254);
    public static final int REMOTE_NONE = (int)( 255);
    public static final int CHARGING_NOT_CHARGING = (int)( 0);
    public static final int CHARGING_CHARGING_RECOVERY = (int)( 1);
    public static final int CHARGING_CHARGING = (int)( 2);
    public static final int CHARGING_TRICKLE_CHARGING = (int)( 3);
    public static final int CHARGING_WAITING = (int)( 4);
    public static final int CHARGING_CHARGING_ERROR = (int)( 5);

    public RawTurtlebotSensorState() {
        this.header = new com.roslib.std_msgs.Header();
        this.bumps_wheeldrops = 0;
        this.wall = false;
        this.cliff_left = false;
        this.cliff_front_left = false;
        this.cliff_front_right = false;
        this.cliff_right = false;
        this.virtual_wall = false;
        this.motor_overcurrents = 0;
        this.dirt_detector_left = 0;
        this.dirt_detector_right = 0;
        this.remote_opcode = 0;
        this.buttons = 0;
        this.distance = 0;
        this.angle = 0;
        this.charging_state = 0;
        this.voltage = 0;
        this.current = 0;
        this.temperature = 0;
        this.charge = 0;
        this.capacity = 0;
        this.wall_signal = 0;
        this.cliff_left_signal = 0;
        this.cliff_front_left_signal = 0;
        this.cliff_front_right_signal = 0;
        this.cliff_right_signal = 0;
        this.user_digital_inputs = 0;
        this.user_analog_input = 0;
        this.charging_sources_available = 0;
        this.oi_mode = 0;
        this.song_number = 0;
        this.song_playing = false;
        this.number_of_stream_packets = 0;
        this.requested_velocity = 0;
        this.requested_radius = 0;
        this.requested_right_velocity = 0;
        this.requested_left_velocity = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        outbuffer[offset + 0] = (byte)((this.bumps_wheeldrops >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((wall ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((cliff_left ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((cliff_front_left ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((cliff_front_right ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((cliff_right ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((virtual_wall ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.motor_overcurrents >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.dirt_detector_left >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.dirt_detector_right >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.remote_opcode >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.buttons >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.distance >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.distance >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.angle >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.angle >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.charging_state >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.voltage >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.voltage >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.current >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.current >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.temperature >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.charge >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.charge >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.capacity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.capacity >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.wall_signal >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.wall_signal >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.cliff_left_signal >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.cliff_left_signal >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.cliff_front_left_signal >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.cliff_front_left_signal >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.cliff_front_right_signal >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.cliff_front_right_signal >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.cliff_right_signal >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.cliff_right_signal >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.user_digital_inputs >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.user_analog_input >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.user_analog_input >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.charging_sources_available >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.oi_mode >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.song_number >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset] = (byte)((song_playing ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.number_of_stream_packets >> (8 * 0)) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.requested_velocity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.requested_velocity >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.requested_radius >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.requested_radius >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.requested_right_velocity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.requested_right_velocity >> (8 * 1)) & 0xFF);
        offset += 2;
        outbuffer[offset + 0] = (byte)((this.requested_left_velocity >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.requested_left_velocity >> (8 * 1)) & 0xFF);
        offset += 2;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        this.bumps_wheeldrops   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.wall = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.cliff_left = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.cliff_front_left = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.cliff_front_right = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.cliff_right = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.virtual_wall = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.motor_overcurrents   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.dirt_detector_left   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.dirt_detector_right   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.remote_opcode   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.buttons   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.distance   = (short)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.distance |= (short)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.angle   = (short)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.angle |= (short)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.charging_state   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.voltage   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.voltage |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.current   = (short)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.current |= (short)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.temperature   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.charge   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.charge |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.capacity   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.capacity |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.wall_signal   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.wall_signal |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.cliff_left_signal   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.cliff_left_signal |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.cliff_front_left_signal   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.cliff_front_left_signal |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.cliff_front_right_signal   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.cliff_front_right_signal |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.cliff_right_signal   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.cliff_right_signal |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.user_digital_inputs   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.user_analog_input   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.user_analog_input |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.charging_sources_available   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.oi_mode   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.song_number   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.song_playing = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.number_of_stream_packets   = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        this.requested_velocity   = (short)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.requested_velocity |= (short)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.requested_radius   = (short)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.requested_radius |= (short)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.requested_right_velocity   = (short)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.requested_right_velocity |= (short)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        this.requested_left_velocity   = (short)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.requested_left_velocity |= (short)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        offset += 2;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 2;
        length += 2;
        length += 1;
        length += 2;
        length += 2;
        length += 1;
        length += 2;
        length += 2;
        length += 2;
        length += 2;
        length += 2;
        length += 2;
        length += 2;
        length += 1;
        length += 2;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 1;
        length += 2;
        length += 2;
        length += 2;
        length += 2;
        return length;
    }

    public java.lang.String getType(){ return "create_node/RawTurtlebotSensorState"; }
    public java.lang.String getMD5(){ return "91d6c17bc6b8873bf934d7f65c746867"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}