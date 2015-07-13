//
//  Day.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/12/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Day : NSObject{
    int totalHours;
    int sleepHours;
    int hoursInSchool;
    int hoursWorking;
    int hoursForPlay;
    int specialHours;
}

// getter methods
-(int)getTotalHours;
-(int)getSleepHours;
-(int)getHoursForSchool;
-(int)getHoursWorking;
-(int)getHoursForPlay;
-(int)getSpecialHours;

// setter methods
-(void)setTotalHours:(int)value;
-(void)setSleepHours:(int)value;
-(void)setHoursInSchool:(int)value;
-(void)setHoursWorking:(int)value;
-(void)sethoursForPlay:(int)value;
-(void)setSpecialHours:(int)value;

@end
