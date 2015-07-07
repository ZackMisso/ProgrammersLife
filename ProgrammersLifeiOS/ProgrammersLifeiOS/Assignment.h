//
//  Assignment.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "TimeStamp.h"
#import "Player.h"

@interface Assignment : NSObject{
    TimeStamp *dueDate;
    int checkPointsNeeded;
    int currentCheckPoints;
    int meanBrainPoints;
    int payPerHour;
}

-(int)calculateCheckPointsToAdd:(Player*) player;

// getter methods
-(TimeStamp*)getDueDate;
-(int)getCheckPointsNeeded;
-(int)getCurrentCheckPoints;
-(int)getMeanBrainPoints;
-(int)getPayPerHour;

// setter methods
-(void)setDueDate:(TimeStamp*)value;
-(void)setCheckPointsNeeded:(int)value;
-(void)setCurrentCheckPoints:(int)value;
-(void)setMeanBrainPoints:(int)value;
-(void)setPayPerHour:(int)value;

@end       
