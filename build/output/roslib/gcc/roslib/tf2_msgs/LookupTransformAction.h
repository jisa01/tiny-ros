#ifndef _ROS_tf2_msgs_LookupTransformAction_h
#define _ROS_tf2_msgs_LookupTransformAction_h

#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include "ros/msg.h"
#include "tf2_msgs/LookupTransformActionGoal.h"
#include "tf2_msgs/LookupTransformActionResult.h"
#include "tf2_msgs/LookupTransformActionFeedback.h"

namespace tf2_msgs
{

  class LookupTransformAction : public ros::Msg
  {
    public:
      typedef tf2_msgs::LookupTransformActionGoal _action_goal_type;
      _action_goal_type action_goal;
      typedef tf2_msgs::LookupTransformActionResult _action_result_type;
      _action_result_type action_result;
      typedef tf2_msgs::LookupTransformActionFeedback _action_feedback_type;
      _action_feedback_type action_feedback;

    LookupTransformAction():
      action_goal(),
      action_result(),
      action_feedback()
    {
    }

    virtual int serialize(unsigned char *outbuffer) const
    {
      int offset = 0;
      offset += this->action_goal.serialize(outbuffer + offset);
      offset += this->action_result.serialize(outbuffer + offset);
      offset += this->action_feedback.serialize(outbuffer + offset);
      return offset;
    }

    virtual int deserialize(unsigned char *inbuffer)
    {
      int offset = 0;
      offset += this->action_goal.deserialize(inbuffer + offset);
      offset += this->action_result.deserialize(inbuffer + offset);
      offset += this->action_feedback.deserialize(inbuffer + offset);
      return offset;
    }

    virtual int serializedLength() const
    {
      int length = 0;
      length += this->action_goal.serializedLength();
      length += this->action_result.serializedLength();
      length += this->action_feedback.serializedLength();
      return length;
    }

    const char * getType(){ return "tf2_msgs/LookupTransformAction"; }
    const char * getMD5(){ return "49655e848adf6c64870a8eb763b94484"; }

  };

}
#endif