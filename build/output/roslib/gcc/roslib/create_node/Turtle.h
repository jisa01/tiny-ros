#ifndef _ROS_create_node_Turtle_h
#define _ROS_create_node_Turtle_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"

namespace create_node
{

  class Turtle : public ros::Msg
  {
    public:
      typedef float _linear_type;
      _linear_type linear;
      typedef float _angular_type;
      _angular_type angular;

    Turtle():
      linear(0),
      angular(0)
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      union {
        float real;
        uint32_t base;
      } u_linear;
      u_linear.real = this->linear;
      *(outbuffer + offset + 0) = (u_linear.base >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (u_linear.base >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (u_linear.base >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (u_linear.base >> (8 * 3)) & 0xFF;
      offset += sizeof(this->linear);
      union {
        float real;
        uint32_t base;
      } u_angular;
      u_angular.real = this->angular;
      *(outbuffer + offset + 0) = (u_angular.base >> (8 * 0)) & 0xFF;
      *(outbuffer + offset + 1) = (u_angular.base >> (8 * 1)) & 0xFF;
      *(outbuffer + offset + 2) = (u_angular.base >> (8 * 2)) & 0xFF;
      *(outbuffer + offset + 3) = (u_angular.base >> (8 * 3)) & 0xFF;
      offset += sizeof(this->angular);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      union {
        float real;
        uint32_t base;
      } u_linear;
      u_linear.base = 0;
      u_linear.base |= ((uint32_t) (*(inbuffer + offset + 0))) << (8 * 0);
      u_linear.base |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1);
      u_linear.base |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2);
      u_linear.base |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3);
      this->linear = u_linear.real;
      offset += sizeof(this->linear);
      union {
        float real;
        uint32_t base;
      } u_angular;
      u_angular.base = 0;
      u_angular.base |= ((uint32_t) (*(inbuffer + offset + 0))) << (8 * 0);
      u_angular.base |= ((uint32_t) (*(inbuffer + offset + 1))) << (8 * 1);
      u_angular.base |= ((uint32_t) (*(inbuffer + offset + 2))) << (8 * 2);
      u_angular.base |= ((uint32_t) (*(inbuffer + offset + 3))) << (8 * 3);
      this->angular = u_angular.real;
      offset += sizeof(this->angular);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += sizeof(this->linear);
      length += sizeof(this->angular);
      return length;
    }

    const char * getType(){ return "create_node/Turtle"; }
    const char * getMD5(){ return "07e0153b5d95d5162da359838872df3a"; }

  };

}
#endif