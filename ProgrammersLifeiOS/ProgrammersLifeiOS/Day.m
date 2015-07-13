//
//  Day.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/12/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "Day.h"

@implementation Day

-(id)init{
    if(self = [super init]){
        // to be implemented
    }
    return self;
}

// getter methods
-(int)getTotalHours { return totalHours; }
-(int)getSleepHours { return sleepHours; }
-(int)getHoursForSchool { return hoursInSchool; }
-(int)getHoursWorking { return hoursWorking; }
-(int)getHoursForPlay { return hoursForPlay; }
-(int)getSpecialHours { return specialHours; }

// setter methods
-(void)setTotalHours:(int)value { totalHours = value; }
-(void)setSleepHours:(int)value { sleepHours = value; }
-(void)setHoursInSchool:(int)value { hoursInSchool = value; }
-(void)setHoursWorking:(int)value { hoursWorking = value; }
-(void)sethoursForPlay:(int)value { hoursForPlay = value; }
-(void)setSpecialHours:(int)value { specialHours = value; }

@end