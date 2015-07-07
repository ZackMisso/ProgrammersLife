//
//  Assignment.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "Assignment.h"

@implementation Assignment

-(id)init{
    if(self = [super init]){
        // to be implemented
    }
    return self;
}

-(int)calculateCheckPointsToAdd:(Player*) player{
    // to be implemented
    return -1;
}

// getter methods
-(TimeStamp*)getDueDate { return dueDate; }
-(int)getCheckPointsNeeded { return checkPointsNeeded; }
-(int)getCurrentCheckPoints { return currentCheckPoints; }
-(int)getMeanBrainPoints { return meanBrainPoints; }
-(int)getPayPerHour { return payPerHour; }

// setter methods
-(void)setDueDate:(TimeStamp*)value { dueDate = value; }
-(void)setCheckPointsNeeded:(int)value { checkPointsNeeded = value; }
-(void)setCurrentCheckPoints:(int)value { currentCheckPoints = value; }
-(void)setMeanBrainPoints:(int)value { meanBrainPoints = value; }
-(void)setPayPerHour:(int)value { payPerHour = value; }

@end
