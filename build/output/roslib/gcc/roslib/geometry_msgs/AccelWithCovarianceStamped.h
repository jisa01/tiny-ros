#ifndef _ROS_geometry_msgs_AccelWithCovarianceStamped_h
#define _ROS_geometry_msgs_AccelWithCovarianceStamped_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "std_msgs/Header.h"
#include "geometry_msgs/AccelWithCovariance.h"

namespace geometry_msgs
{

  class AccelWithCovarianceStamped : public ros::Msg
  {
    public:
      typedef std_msgs::Header _header_type;
      _header_type header;
      typedef geometry_msgs::AccelWithCovariance _accel_type;
      _accel_type accel;

    AccelWithCovarianceStamped():
      header(),
      accel()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      offset += this->header.serialize(outbuffer + offset);
      offset += this->accel.serialize(outbuffer + offset);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      offset += this->header.deserialize(inbuffer + offset);
      offset += this->accel.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->header.serializedLength();
      length += this->accel.serializedLength();
      return length;
    }

    const char * getType(){ return "geometry_msgs/AccelWithCovarianceStamped"; }
    const char * getMD5(){ return "efd9e7d0b5ca262cc8b05aa8e97c984f"; }

  };

}
#endif