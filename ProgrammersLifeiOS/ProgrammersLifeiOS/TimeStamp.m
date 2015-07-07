//
//  TimeStamp.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "TimeStamp.h"

@implementation TimeStamp

-(id)init{
    if(self = [super init]){
        day = 0;
        month = 0;
        year = 0;
    }
    return self;
}

// getter methods
-(int)getDay { return day; }
-(int)getMonth { return month; }
-(int)getYear { return year; }

// setter methods
-(void)setDay:(int)value { day = value; }
-(void)setMonth:(int)value { month = value; }
-(void)setYear:(int)value { year = value; }

@end